package hw8;

import robocode.*;

public class EnemyBot extends AdvancedRobot {
	// private data
	private double bearing;
	private double distance;
	private double energy;
	private double heading;
	private String name;
	private double velocity;

	public EnemyBot() {
		reset();
	}

	public void reset() {
		this.bearing  = 0.0;
		this.distance = 0.0;
		this.energy   = 0.0;
		this.heading  = 0.0;
		this.name     = new String("");
		this.velocity = 0.0;
	}

	public final void update(ScannedRobotEvent event) {
		this.bearing  = event.getBearing();
		this.distance = event.getDistance();
		this.energy   = event.getEnergy();
		this.heading  = event.getHeading();
		this.name     = event.getName();
		this.velocity = event.getVelocity();
	}

	public boolean shouldTrack(ScannedRobotEvent event, long n) {
		return true;
	}

	public boolean none() {
		return this.name.equals("");
	}

	public double getBearing() {
		return this.bearing;
	}

	public double getDistance() {
		return this.distance;
	}

	public double getEnergy() {
		return this.energy;
	}

	public double getHeading() {
		return this.heading;
	}

	public String getName() {
		return this.name;
	}

	public double getVelocity() {
		return this.velocity;
	}
}
