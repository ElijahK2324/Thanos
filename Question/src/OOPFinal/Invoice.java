package OOPFinal;
import java.util.ArrayList;
import java.util.Arrays;

public class Invoice {
	
	private Customer theCustomer = new Customer(null, null, 0);
	private ArrayList<Lineitem> items = new ArrayList<Lineitem>();
	
	public Invoice(Customer theCustomer)
	{
		
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
		if(theCustomer.getEvilFunds() > amountDue())
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public void printInvoice() {
		for(int i = 0; i < items.size(); i ++ )
		{
			String name = items.get(i).getProduct().getname();
			double price = items.get(i).getProduct().getPrice();
			System.out.printf("name: %-15s price %-15s \n", name, price);
		}
		
		if(canAfford(theCustomer) == true)
		{
			System.out.println("you can afford this enjoy your new stuffz");
		}
		else
		{
			double remaining = amountDue() - theCustomer.getEvilFunds();
			System.out.println("\nSorry you can't afford this you are $" + remaining + " short");
		}
	}
	

}
