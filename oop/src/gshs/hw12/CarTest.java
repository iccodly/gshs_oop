package hw12;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car(6, 2, 3, 4);
		for (int i = 0; i < 5; i++) {
			car.run();
		}
	}
}
