package hw11;

public class MyProduct {
	private String name;
	private int price;

	public MyProduct(String name, int price) {
		this.name  = name;
		this.price = price;
	}

	public MyProduct() {
		this.name  = new String("물");
		this.price = 800;
	}

	public MyProduct(int price) {
		this.name  = new String("물");
		this.price = price;
	}

	public MyProduct(String name) {
		this.name  = name;
		this.price = 800;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
