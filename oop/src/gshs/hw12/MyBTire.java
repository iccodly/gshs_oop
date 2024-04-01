package hw12;

public class MyBTire extends MyTire {
	public MyBTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	public boolean roll() {
		if (this.maxRotation <= this.accumulatedRotation) {
			return false;
		}
		this.accumulatedRotation += 1;
		if (this.maxRotation == this.accumulatedRotation) {
			System.out.println(this.location + " ** B 타이어 교체 필요 **");
			return false;
		}
		System.out.println(this.location + " - B 타이어 남은 수명 : " + (this.maxRotation - this.accumulatedRotation));
		return true;
	}
}
