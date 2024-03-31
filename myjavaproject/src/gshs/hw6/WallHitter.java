package com.gshs.hw6;

import java.text.NumberFormat;

import robocode.*;

public class WallHitter extends Robot {
	public void run() {
		out.println("Battlefield width = " + getBattleFieldWidth());
		out.println("Battlefield height = " + getBattleFieldHeight());
		while (true) {
			// face up
			turnLeft(getHeading());
			ahead(10000);
			// face right
			turnRight(90);
			ahead(10000);
			// face down
			turnRight(90);
			ahead(10000);
			// face left
			turnRight(90);
			ahead(10000);
		}
	}

	public void onHitWall(HitWallEvent event) {
		NumberFormat f = NumberFormat.getNumberInstance();
		f.setMaximumFractionDigits(2);
		out.println("hit a wall (x, y) = (" + f.format(getX()) + ", " +
				f.format(getY()) + ")");
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
	}
}
