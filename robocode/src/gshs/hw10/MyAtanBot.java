package hw10;

import robocode.*;
import java.lang.Math;

public class AtanBot extends AdvancedRobot {
	public void run() {
		System.out.println("Current position: (" + getX() + ", " + getY() + ")");
		double dx = 100 - getX();
		double dy = 100 - getY();
		double dist = Math.hypot(dx, dy);
		double rad = Math.atan2(dy, dx);
		double deg = -180 / Math.PI * rad + 90;
		turnRight(deg - getHeading());
		ahead(dist);
		System.out.println("Current position: (" + getX() + ", " + getY() + ")");
	}
}