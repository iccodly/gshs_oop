package hw7;

import robocode.*;

public class NotAdvancedSampleBot extends Robot {
	public void run() {
		while (true) {
			ahead(100);
			turnRight(90);
			turnGunRight(360);
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
	}

	public void onHitByBullet(HitByBulletEvent e) {
		turnLeft(90 - e.getBearing());
	}
}
