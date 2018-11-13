
public class fundraise {
	

	public static void main(String[] args) {
		
		
		// initalize needed variables
		// names, money raised, returned form total average and over 200 payed
		String[] names = {"Kris", "Kim", "Lam", "Shantae","Bobette","Jerry","Billy","Bill","Lucy"};
		double[] raisedMoney = new double[names.length];
		boolean[] returnedForm = new boolean[names.length]; 
		double totalRaised = 0;
		double average = 0;
		int bigMoney = 0;

		for(int i = 0; i < names.length; i ++)
		{
			// set raised money to random values (50-250)
			raisedMoney[i] = (int)(Math.random() * 200) + 50;
			if(raisedMoney[i] >= 100)
			{
				// if they donated less than 100 then make it so they didnt give in form
				returnedForm[i] = true;
				bigMoney ++;
			
			}
			else 
			{
				returnedForm[i] = false;
			}
			
		}// end of for
		
		for(int i = 0; i < names.length; i ++)
		{
			//calculate total 
			totalRaised += raisedMoney[i];
		}// end of for
		
		for(int i = 0; i < names.length; i ++)
		{
			// print out information
			System.out.println("name: " + names[i] + " gave $" + raisedMoney[i] + " returned form? " + returnedForm[i]);
			
		}// end of for
		
		System.out.println("\n");
		
		// for loop
		for(int i = 0; i < names.length; i ++)
		{
			// print out information
			if(returnedForm[i] == false)
			{
				// show who did not return their form
				System.out.println(names[i] + " did not return their form");
			}
			
		}// end of for
		
		// init variables
		double lowestAmt = 0;
		int nameindex = 0;
		
		for(int i = 0; i < raisedMoney.length; i ++)
		{
			
			// update who gave the lowest amount of money 
			if(lowestAmt <= raisedMoney[i] )
			{
				// record what amount was the lowest and who gave that amount 
				lowestAmt = raisedMoney[i];
				nameindex = i;
			}
			
		}// end of for
		
		// print a new line for formatting
		System.out.print("\n");
		
		// who gave the lowest money
		System.out.println(names[nameindex] + " gave the lowest money at $" + lowestAmt);
		// print total number who gave over 200
		System.out.println(bigMoney + " people gave over $200 "  );
		// print total and average
		average = totalRaised/10;
		System.out.println("We raised a total of " + totalRaised + " so on average we raised roughly " + average + " per person" );
		
	} // end of main

}// end of class

//OUTPUT
/**
name: Kris gave $243.0 returned form? true
name: Kim gave $169.0 returned form? true
name: Lam gave $144.0 returned form? true
name: Shantae gave $89.0 returned form? false
name: Bobette gave $82.0 returned form? false
name: Jerry gave $176.0 returned form? true
name: Billy gave $201.0 returned form? true
name: Bill gave $83.0 returned form? false
name: Lucy gave $62.0 returned form? false


Shantae did not return their form
Bobette did not return their form
Bill did not return their form
Lucy did not return their form

lucy gave the lowest money at $62.0
5 people gave over $200 
We raised a total of 1249.0 so on average we raised roughly 124.9 per person
*/
