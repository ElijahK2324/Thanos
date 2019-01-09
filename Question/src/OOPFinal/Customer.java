package OOPFinal;

public class Customer {
	
	// create the variables
	private String secretLairLocation;
	private String name;
	private double evilFunds;
	
	// set instance variables into called variables
	public Customer(String secretLairLocation, String name, double evilFunds)
	{
		this.secretLairLocation = secretLairLocation;
		this.name = name;
		this.evilFunds = evilFunds;
		
	}
	
	// add funds
	public void addFunds(double funds) 
	{
		this.setEvilFunds(this.getEvilFunds() + funds);
	}
	
	// to string
	public String toString()
	{
		 return "secretLairLocation" + secretLairLocation +
				"Name" + name +
				"evilFunds" + getEvilFunds(); // lair, name, evil funds;
	}

	// create getter fir evil funds
	public double getEvilFunds() {
		return evilFunds;
	}

	// create setter for evil f
	public void setEvilFunds(double evilFunds) {
		this.evilFunds = evilFunds;
	}

}
