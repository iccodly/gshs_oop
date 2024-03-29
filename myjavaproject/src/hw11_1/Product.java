package hw11_1;

public class Product {
	private String name;
	private int price;

	public Product() {
		this.name = new String("물");
		this.price = 800;
	}

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Product(int price) {
		this.name = new String("물");
		this.price = price;
	}

	public Product(String name) {
		this.name = name;
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
