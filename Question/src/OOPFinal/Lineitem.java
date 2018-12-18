package OOPFinal;

public class Lineitem {
	private int quantity;
	private Product theProduct;
	
	
	Lineitem(Product theProduct, int quanitity){
		this.theProduct = theProduct;
		this.quantity = quantity;
	}
	
	public String toString() 
	{
		return "theProduct " + theProduct + "quantity " + quantity;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
