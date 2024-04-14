package hw17_1;

public class Kid {
	private Toy toy;

	public void setToy(Toy toy) {
		this.toy = toy;
	}

	public void playwith() {
		System.out.println(toy.toString());
	}
}
