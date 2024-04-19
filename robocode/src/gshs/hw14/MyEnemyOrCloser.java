package hw14;

import robocode.*;

public class MyEnemyOrCloser extends AdvancedRobot {
	private int id;
	private int cnt;
	private EnemyBot[] enemies = new EnemyBot[10];

	public void run() {
		setAdjustRadarForGunTurn(true);
		id = -1;
		cnt = 0;
		for (int i = 0; i < 10; i++) {
			enemies[i] = new EnemyBot();
			enemies[i].reset();
		}
		while (true) {
			doScanner();
			doMovement();
			doGun();
			cnt += 1;
			System.out.println("count: " + cnt);
			if (cnt >= 45) {
				cnt = 0;
				doReset();
				System.out.println("reset the array");
			}
			execute(); // you must call this!!!
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		System.out.println("I scanned a robot: " + e.getName());
		if (id == -1) {
			System.out.println("Now enemy: None");
		} else {
			System.out.println("Now enemy: " + enemies[id].getName());
		}
		for (int i = 0; i < 10; i++) {
			if (enemies[i].none() || enemies[i].getName().equals(e.getName())) {
				enemies[i].update(e);
				break;
			}
		}
		for (int i = 0; i < 10; i++) {
			if (enemies[i].none()) {
				continue;
			}
			if (id == -1 || // we have no enemy, or...
					enemies[i].getDistance() < enemies[id].getDistance() - 70 || // the one we just spotted is closer, or...
					enemies[i].getEnergy() < enemies[id].getEnergy() - 40 || // the one we just spotted has lower energy, or...
					enemies[i].getName().equals(enemies[id].getName()) // we found the one we've been tracking
			) {
				// track him
				id = i;
				System.out.println("Enemy is changed: " + enemies[id].getName());
				System.out.println("Distance: " + enemies[id].getDistance());
				// turn toward the enemy, a la BearingBot
				setTurnRight(enemies[id].getBearing());
			}
		}
	}

	public void onRobotDeath(RobotDeathEvent e) {
		// check if the enemy we were tracking died
		for (int i = 0; i < 10; i++) {
			if (enemies[i].getName().equals(e.getName())) {
				System.out.println("Enemy is erased: " + enemies[i].getName());
				enemies[i].reset();
			}
		}
		id = -1;
	}

	void doScanner() {
		setTurnRadarRight(360);
	}

	void doMovement() {
		// int enemynumber = -1;
		// for (int i = 0; i < 10; i++) {
		// 	if (enemies[i].none()) {
		// 		continue;
		// 	}
		// 	if (enemynumber == -1 || enemies[enemynumber].getDistance() > enemies[i].getDistance()) {
		// 		enemynumber = i;
		// 	}
		// }
		// if (enemynumber == -1) {
		// 	return;
		// }
		// setTurnRight(enemies[enemynumber].getBearing());
		// double dist = enemies[enemynumber].getDistance();
		// if (dist > 400) {
		// 	setAhead(dist / 2);
		// } else if (dist < 100) {
		// 	setBack(dist);
		// }

		// turning here causes a weird behavior, prolly because we're working
		// with outdated information
		// setTurnRight(enemy.getBearing());
		if (id == -1) {
			setAhead(20);
			setTurnRight(15);
		} else if (enemies[id].getDistance() > 200) {
			// move a little closer
			setAhead(enemies[id].getDistance() / 2);
		} else if (enemies[id].getDistance() < 100) {
			// but not too close
			setBack(enemies[id].getDistance() + 30);
		} else {
			setBack(10);
		}
	}

	void doGun() {
		// don't fire if there's no enemy
		if (id == -1 || enemies[id].none()) {
			return;
		}
		// convenience variable
		double max = Math.max(getBattleFieldHeight(),
				getBattleFieldWidth());
		// only shoot if we're (close to) pointing at our enemy
		if (Math.abs(getTurnRemaining()) < 10) {
			if (enemies[id].getDistance() < max / 3) {
				// fire hard when close
				setFire(3);
			} else {
				// otherwise, just plink him
				setFire(1);
			}
		}
	}

	public void doReset() {
		for (int i = 0; i < 10; i++) {
			enemies[i].reset();
		}
		id = -1;
	}
}
