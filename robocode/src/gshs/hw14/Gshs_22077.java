package hw14;

import robocode.*;

public class Gshs_22077 extends AdvancedRobot {
	private EnemyBot enemy = new EnemyBot();
	private EnemyBot[] enemylist = new EnemyBot[10];

	public void run() {
		setAdjustRadarForGunTurn(true);
		enemy.reset();
		for (EnemyBot e : enemylist) {
			e.reset();
		}
		while (true) {
			doScanner();
			doMovement();
			doGun();
			execute(); // you must call this!!!
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		if (
		// we have no enemy, or...
		enemy.none() ||
		// the one we just spotted is closer, or...
				e.getDistance() < enemy.getDistance() - 70 ||
				// we found the one we've been tracking
				e.getName().equals(enemy.getName())) {
			// track him
			enemy.update(e);
			// turn toward the enemy, a la BearingBot
			setTurnRight(e.getBearing());
		}
		for (int i = 0; i < 10; i++) {
			if (enemylist[i].none() || enemylist[i].getName().equals(e.getName())) {
				enemylist[i].update(e);
			}
		}
	}

	public void onRobotDeath(RobotDeathEvent e) {
		// check if the enemy we were tracking died
		if (e.getName().equals(enemy.getName())) {
			enemy.reset();
		}
		for (int i = 0; i < 10; i++) {
			if (enemylist[i].getName().equals(e.getName())) {
				enemylist[i].reset();
			}
		}
	}

	void doScanner() {
		setTurnRadarRight(360);
	}

	void doMovement() {
		// turning here causes a weird behavior, prolly because we're working
		// with outdated information
		//setTurnRight(enemy.getBearing());
		// move a little closer
		if (enemy.getDistance() > 200) {
			setAhead(enemy.getDistance() / 2);
		}
		// but not too close
		if (enemy.getDistance() < 100) {
			setBack(enemy.getDistance());
		}
	}

	void doGun() {
		// don't fire if there's no enemy
		if (enemy.none()) {
			return;
		}
		// 에너지가 적을 경우 발사하지 않기 /* 수정한 부분!! */
		if (this.getEnergy() < 40) {
			return;
		}
		// convenience variable
		double max = Math.max(getBattleFieldHeight(),
				getBattleFieldWidth());
		// only shoot if we're (close to) pointing at our enemy
		if (Math.abs(getTurnRemaining()) < 10) {
			if (enemy.getDistance() < max / 3) {
				// fire hard when close
				setFire(3);
			} else {
				// otherwise, just plink him
				setFire(1);
			}
		}
	}
}
