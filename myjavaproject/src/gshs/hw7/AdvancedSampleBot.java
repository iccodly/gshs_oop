package com.gshs.hw7;

import robocode.*;

public class AdvancedSampleBot extends AdvancedRobot {
	public void run() {
		while (true) {
			setAhead(100);
			setTurnRight(90);
			setTurnGunRight(360);
			execute();
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
	}

	public void onHitByBullet(HitByBulletEvent e) {
		turnLeft(90 - e.getBearing());
	}
}
