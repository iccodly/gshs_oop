package hw11;

public class MyProductTest {
	public static void main(String[] args) {
		MyProduct welch = new MyProduct("웰치", 700);
		MyProduct coffee = new MyProduct("커피");
		MyProduct water1 = new MyProduct(500);
		MyProduct water2 = new MyProduct();
		System.out.println(welch.getName() + ", " + welch.getPrice());
		System.out.println(coffee.getName() + ", " + coffee.getPrice());
		System.out.println(water1.getName() + ", " + water1.getPrice());
		System.out.println(water2.getName() + ", " + water2.getPrice());
	}
}
