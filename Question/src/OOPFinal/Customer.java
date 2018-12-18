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
	
	public void addFunds(int funds) 
	{
		this.evilFunds += funds;
	}
	
	public String toString()
	{
		 return "secretLairLocation" + secretLairLocation +
				"Name" + name +
				"evilFunds" + evilFunds; // lair, name, evil funds;
	}

}
