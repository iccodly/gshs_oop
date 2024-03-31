package com.gshs.hw6;

import robocode.*;

public class MyScanner extends Robot {
	public void run() {
		while (true) {
			turnRadarRight(360);
			stop();
		}
	}

	public void onScannedRobot(ScannedRobotEvent event) {
		turnRight(event.getBearing());
		if (event.getDistance() > 100) {
			ahead(event.getDistance() - 100);
		}
		fire(1);
	}
}
