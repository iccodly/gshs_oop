package hw11;

public class MyCar {
	private int speed;
	private int direction;

	public MyCar(int speed, int direction) {
		this.speed     = speed;
		this.direction = direction;
	}

	public MyCar(int speed) {
		this.speed     = speed;
		this.direction = 20;
	}

	public MyCar() {
		this.speed     = 10;
		this.direction = 20;
	}

	public void print1() {
		System.out.println("속도 : " + this.speed + ", 방향 : " + this.direction);
	}
}
