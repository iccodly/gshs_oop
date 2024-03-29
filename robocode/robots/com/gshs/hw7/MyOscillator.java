package com.gshs.hw7;

import robocode.*;

public class MyOscillator extends AdvancedRobot {
	private byte scanDirection = 1;

	public void run() {
		setAdjustRadarForGunTurn(true);
		setTurnRadarRight(36000);
		execute();
	}

	public void onScannedRobot(ScannedRobotEvent event) {
		setTurnRight(event.getBearing());
		if (event.getDistance() > 100) {
			setAhead(event.getDistance() - 100);
		}
		setFire(3);
		scanDirection *= -1;
		setTurnRadarRight(3600 * scanDirection);
	}
}
