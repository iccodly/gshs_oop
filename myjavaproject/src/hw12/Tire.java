package hw12;

public class Tire {
	private int maxRotation;
	private int accumulatedRotation;
	private String location;

	public Tire(String location, int maxRotation) {
		this.maxRotation = maxRotation;
		this.accumulatedRotation = 0;
		this.location = location;
	}

	public boolean roll() {
		if (accumulatedRotation < maxRotation) {
			accumulatedRotation += 1;
			return true;
		} else {
			return false;
		}
	}

	public void setMaxRotation(int maxRotation) {
		this.maxRotation = maxRotation;
	}

	public void setAccumulatedRotation(int accumulatedRotation) {
		this.accumulatedRotation = accumulatedRotation;
	}
	
	public int getLifespan() {
		return this.maxRotation - this.accumulatedRotation;
	}

	public String getLocation() {
		return this.location;
	}

	public String getType() {
		return "Tire";
	}
}
