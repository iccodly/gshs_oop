package hw6;

import robocode.*;

public class IndependentRotateBot extends Robot {
	public void run() {
		out.println("current heading = " + getHeading());
		// face up
		turnLeft(getHeading());
		out.println("heading is now = " + getHeading());
		stop();
		// face right
		turnRight(90);
		out.println("heading is now = " + getHeading());
		stop();
		// face down
		turnRight(90);
		out.println("heading is now = " + getHeading());
		stop();
		// face left
		turnRight(90);
		out.println("heading is now = " + getHeading());
		stop();
		// face up again
		turnRight(90);
		out.println("heading is now = " + getHeading());
		stop();

		out.println("current gun heading = " + getGunHeading());
		// detach gun
		setAdjustGunForRobotTurn(true);
		// point gun right
		turnGunRight(90);
		out.println("gun heading is now = " + getGunHeading());
		stop();
		// point gun down
		turnGunRight(90);
		out.println("gun heading is now = " + getGunHeading());
		stop();
		// point gun left
		turnGunRight(90);
		out.println("gun heading is now = " + getGunHeading());
		stop();
		// point gun up again
		turnGunRight(90);
		out.println("gun heading is now = " + getGunHeading());
		stop();
		out.println("current radar heading = " + getRadarHeading());
		
		// detach radar
		setAdjustRadarForRobotTurn(true);
		// point radar right
		turnRadarRight(90);
		out.println("radar heading is now = " + getRadarHeading());
		stop();
		// point radar down
		turnRadarRight(90);
		out.println("radar heading is now = " + getRadarHeading());
		stop();
		// point radar left
		turnRadarRight(90);
		out.println("radar heading is now = " + getRadarHeading());
		stop();
		// point radar up again
		turnRadarRight(90);
		out.println("radar heading is now = " + getRadarHeading());
		stop();
	}
}
