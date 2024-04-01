package hw12;

public class MyCar {
	MyTire frontLeftTire;
	MyTire frontRightTire;
	MyTire backLeftTire;
	MyTire backRightTire;

	public MyCar() {
		this.frontLeftTire  = new MyTire("Front-Left-Tire", 6);
		this.frontRightTire = new MyTire("Front-Right-Tire", 2);
		this.backLeftTire   = new MyTire("Back-Left-Tire", 3);
		this.backRightTire  = new MyTire("Back-Right-Tire", 4);
	}

	int run() {
		System.out.println("자동차 주행중");
		if (this.frontLeftTire.roll() == false) {
			stop(0);
			this.frontRightTire.accumulatedRotation += 1;
			this.backLeftTire.accumulatedRotation   += 1;
			this.backRightTire.accumulatedRotation  += 1;
		} else if (this.frontRightTire.roll() == false) {
			stop(1);
			this.backLeftTire.accumulatedRotation  += 1;
			this.backRightTire.accumulatedRotation += 1;
		} else if (this.backLeftTire.roll() == false) {
			this.backRightTire.accumulatedRotation += 1;
			stop(2);
		} else if (this.backRightTire.roll() == false) {
			stop(3);
		}
		System.out.println("++++++++++++++++++++++++");
		return 0;
	}

	void stop(int type) {
		System.out.println("자동차 멈춤");
		if (type == 0) {
			System.out.println("앞 왼쪽 A Tire 교체");
			this.frontLeftTire = new MyATire("Front-Left-Tire", 13);
		} else if (type == 1) {
			System.out.println("앞 오른쪽 B Tire 교체");
			this.frontRightTire = new MyBTire("Front-Right-Tire", 13);
		} else if (type == 2) {
			System.out.println("뒤 왼쪽 A Tire 교체");
			this.backLeftTire = new MyATire("Back-Left-Tire", 13);
		} else if (type == 3) {
			System.out.println("뒤 오른쪽 B Tire 교체");
			this.backRightTire = new MyBTire("Back-Right-Tire", 13);
		}
	}
}
