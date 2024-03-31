package hw11_2;

public class Car {
	private int speed;
	private int direction;

	public Car() {
		this.speed = 10;
		this.direction = 20;
	}

	public Car(int speed) {
		this.speed = speed;
		this.direction = 20;
	}

	public Car(int speed, int direction) {
		this.speed = speed;
		this.direction = direction;
	}

	public void print() {
		System.out.println("속도 : " + this.speed + ", 방향 : " + this.direction);
	}

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car(50);
		Car car3 = new Car(60, 40);
		car1.print();
		car2.print();
		car3.print();
	}
}
