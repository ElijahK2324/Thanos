package OOPFinal;

public class TestInvoice {
	
	//do not modify code below
		public static void runInvoice(Customer c, Invoice i) {
			i.printInvoice();
			
			double remaining = i.amountDue() - c.getEvilFunds();
			//////////////////////////////////////////////////////////////////
			if (remaining > 0) {
				System.out.println("Evil villian credit union to the rescue!! \nadding " + remaining + " to your account");	
				c.addFunds((i.amountDue() - c.getEvilFunds()));
				System.out.println("\nNew funds total: " + c.getEvilFunds());
				i.printInvoice();
			}
					
		}//end runInvoice
		
	public static void main(String[] args) {

		// create 3 additional invoice runs
		// add at least 5 items to invoice order for each invoice run
		// make sure in at least one of the runs the customer can not afford the purchase
		
		//invoice run 1
		Customer c = new Customer("island", "Dr evil", 1230.0);
		Invoice in = new Invoice(c);
		in.addToOrder(new Product("flame Thower",123.80), 3);
		in.addToOrder(new Product("sharks", 105.2),2);
		in.addToOrder(new Product("lasers",50.5),20);
		
		runInvoice(c,in); //runs invoice
		
		//invoice run 2
		c = new Customer("beach", "Dr live", 123453.0);
		in = new Invoice(c);
		in.addToOrder(new Product("donut",40), 3);
		in.addToOrder(new Product("evil donut", 3.75),2);
		in.addToOrder(new Product("evil glaze donut",50.5),10);
		
		runInvoice(c,in); //runs invoic
		
		//invoice run 3
		c = new Customer("city", "Dr 234", 123453.0);
		in = new Invoice(c);
		in.addToOrder(new Product("muffin",450), 31);
		in.addToOrder(new Product("evilllllllllll muffin", 23),2333);
		in.addToOrder(new Product("evilish evil muffin",123),10);
		
		runInvoice(c,in); //runs invoic
		
		
		//invoice run 4
		c = new Customer("monkey land", "Dr MonkaS", 123453.0);
		in = new Invoice(c);
		in.addToOrder(new Product("shrek",40), 1);
		in.addToOrder(new Product("pepe", 24),5);
		in.addToOrder(new Product("Pepega",234),17);
		
		runInvoice(c,in); //runs invoic
		
	}//end main

}//end TestInvoice
