package hw12;

public class Car {
	private Tire frontLeftTire;
	private Tire frontRightTire;
	private Tire backLeftTire;
	private Tire backRightTire;
	private Tire[] listofTires;
	private int tireChangeCount;

	public Car(int frontLeftTireLifeSpan, int frontRightTireLifeSpan, int backLeftTireLifeSpan,
			int backRightTireLifeSpan) {
		this.frontLeftTire = new Tire("Front-Left-Tire", frontLeftTireLifeSpan);
		this.frontRightTire = new Tire("Front-Right-Tire", frontRightTireLifeSpan);
		this.backLeftTire = new Tire("Back-Left-Tire", backLeftTireLifeSpan);
		this.backRightTire = new Tire("Back-Right-Tire", backRightTireLifeSpan);
		this.listofTires = new Tire[4];
		this.listofTires[0] = this.frontLeftTire;
		this.listofTires[1] = this.frontRightTire;
		this.listofTires[2] = this.backLeftTire;
		this.listofTires[3] = this.backRightTire;
		this.tireChangeCount = 0;
	}

	public void run() {
		System.out.println("자동차 주행중");
		for (int i = 0; i < 4; i++) {
			listofTires[i].roll();
		}
		for (int i = 0; i < 4; i++) {
			if (listofTires[i].getLifespan() == 0) {
				System.out.println(listofTires[i].getLocation() + " ** 타이어 교체 필요 **");
				System.out.println("자동차 멈춤");
				if (tireChangeCount % 2 == 1) {
					listofTires[i] = new ATire(listofTires[i].getLocation(), 13);
				} else {
					listofTires[i] = new BTire(listofTires[i].getLocation(), 13);
				}
				System.out.println(listofTires[i].getLocation() + " " + listofTires[i].getType() + " 교체");
				tireChangeCount += 1;
				break;
			} else {
				System.out.println(listofTires[i].getLocation() + " - " + listofTires[i].getType() + " 남은 수명 : "
						+ listofTires[i].getLifespan());
			}
		}
		System.out.println("+++++++++++++++++++++++");
	}
}
