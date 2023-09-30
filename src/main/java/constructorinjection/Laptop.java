package constructorinjection;

public class Laptop {
	
	private int id;
	private String name;
	private double price;
	
	public Laptop(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
}
