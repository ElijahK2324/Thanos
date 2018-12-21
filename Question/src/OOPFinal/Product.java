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
	
	
	
	// create getter for price and name
	public double getPrice() {
		return price;
	}
	
	public String getname() {
		return name;
	}

	// create setter for price and name
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setname(String name ) {
		this.name = name;
	}
	
	

}
