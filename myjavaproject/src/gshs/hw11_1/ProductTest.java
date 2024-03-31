package hw11_1;

public class ProductTest {
	public static void main(String[] args) {
		Product welch = new Product("웰치", 700);
		Product coffee = new Product("커피");
		Product water1 = new Product(500);
		Product water2 = new Product();
		System.out.println(welch.getName() + ", " + welch.getPrice());
		System.out.println(coffee.getName() + ", " + coffee.getPrice());
		System.out.println(water1.getName() + ", " + water1.getPrice());
		System.out.println(water2.getName() + ", " + water2.getPrice());
	}
}
