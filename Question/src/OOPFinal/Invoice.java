package OOPFinal;
import java.util.ArrayList;
import java.util.Arrays;

public class Invoice {
	
	private Customer theCustomer;
	private ArrayList<Lineitem> items = new ArrayList<Lineitem>();
	
	public Invoice(Customer theCustomer)
	{
		this.theCustomer = theCustomer;
	}
	
	public void addToOrder(Product newproduct, int quantity)
	{
		Lineitem theproduct = new Lineitem(newproduct, quantity);
		items.add(theproduct);
	}

	
	public double amountDue() 
	{
		int totalprice = 0;
		for(int i = 0; i < items.size(); i ++ )
		{
			// check product and price for the product
			totalprice += items.get(i).getQuantity() * items.get(i).getProduct().getPrice();
		}
		return totalprice;
	}
	
	
	public boolean canAfford(Customer theCustomer)
	{
		if(theCustomer.getEvilFunds() >= amountDue())
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	
	public void printInvoice() {
		System.out.println("\n ITEMS");
		for(int i = 0; i < items.size(); i ++ )
		{
			
			// create varaibles and print them
			String itemname = items.get(i).getProduct().getname();
			double itemprice = items.get(i).getProduct().getPrice();
			int itemquantity = items.get(i).getQuantity();
			System.out.printf("name: %-15s price: $%-15s quantity %-15s\n", itemname, itemprice, itemquantity);
			
		}
		
		if(canAfford(theCustomer) == true)
		{
			System.out.println("\nyou can afford this enjoy your new stuffz!");
		}
		else
		{
			double remaining = amountDue() - theCustomer.getEvilFunds();
			System.out.println("\nSorry you can't afford this you are $" + remaining + " short");
		}
	}
	

}
