package OOPFinal;

public class Product {
	
	private String name;
	private double price;
	
	Product(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return "Name" + name + "Price" + price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
