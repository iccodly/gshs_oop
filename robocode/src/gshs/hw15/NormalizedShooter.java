package hw15;

import robocode.*;

public class NormalizedShooter extends AdvancedRobot {
	private EnemyBot enemy = new EnemyBot();

	public void run() {
		// divorce radar movement from gun movement
		setAdjustRadarForGunTurn(true);
		// divorce gun movement from tank movement
		setAdjustGunForRobotTurn(true);
		// we have no enemy yet
		enemy.reset();
		// initial scan
		setTurnRadarRight(360);
		while (true) {
			// rotate the radar
			setTurnRadarRight(360);
			// sit & spin
			setTurnRight(5);
			setAhead(20);
			execute();
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		// track if we have no enemy, the one we found is significantly
		// closer, or we scanned the one we've been tracking.
		if (enemy.none() || e.getDistance() < enemy.getDistance() - 70 ||
				e.getName().equals(enemy.getName())) {
			// track him
			enemy.update(e);
			// calculate gun turn toward enemy
			double turn = getHeading() - getGunHeading() +
					e.getBearing();
			// normalize the turn to take the shortest path there
			setTurnGunRight(normalizeBearing(turn));
			// shoot!
			setFire(Math.min(400 / enemy.getDistance(), 3));
		}
	}

	public void onRobotDeath(RobotDeathEvent e) {
		// see if the robot we were tracking died
		if (e.getName().equals(enemy.getName())) {
			enemy.reset();
		}
	}

	// normalizes a bearing to between +180 and -180
	double normalizeBearing(double angle) {
		while (angle > 180)
			angle -= 360;
		while (angle < -180)
			angle += 360;
		return angle;
	}
}
