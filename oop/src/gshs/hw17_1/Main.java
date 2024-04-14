package hw17_1;

public class Main {
	public static void main(String[] args) {
		Toy t = new Robot();
		Kid k = new Kid();
		k.setToy(t);
		k.playwith();
	}
}
