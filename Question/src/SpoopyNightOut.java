import java.util.Scanner;

public class SpoopyNightOut {
	
	
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String[] monster = {"vampire", "pumpkin head", "medusa", "zombo", "spoopy skeletoon", "player"};
		
		System.out.println("Enter player name");
		monster[monster.length - 1] = "Player: " + input.nextLine();
		
		int[] coins = new int[monster.length];
		
		String[] abilities = new String[monster.length];
		abilities[0] = "fangs";
		abilities[1] = "throw seeds";
		abilities[2] = "akward stares";
		abilities[3] = "taxes";
		abilities[4] = "ungodly spooks";
		abilities[5] = "life insurance";
		
		int[] health = new int[monster.length];
		
		
		
		for(int i = 0; i < monster.length; i ++)
		{
			coins[i] = (int)(Math.random() * 8) + 2;
			health[i] = (int)(Math.random() * 15) + 2;
			System.out.println(monster[i] + " has " + coins[i] + " gold coins");
			System.out.println(monster[i] + " has " + health[i] + " health points");
			System.out.println(monster[i] + " will attack with " + abilities[i] + "\n");
		}
		System.out.println("the " + monster[2] + " ate a teen and got some coins how many did it get? ");
		coins[2] += input.nextInt();
		input.nextLine(); // get rid of extra enter
		
		System.out.println("suddenly " +monster[2] + " morphs! \nwhat did it turn into? ");
		monster[2] = input.nextLine();
		System.out.println("The monster morphed into " + monster[2]);
		
		int turns = 0;
		// TO DO LIST '
		// fight while plaer hp > 0 
		while(health[health.length-1] > 0)  
		{
			int randomMonster = (int)(Math.random() * monster.length);
			if(randomMonster != monster.length-1) 
			{
				// decide if hit or miss
				int hitChance = (int)(Math.random() * 2);
				if(hitChance % 2 == 0) 
				{
					// if player is hit decrease health
					int randomDmg = (int)(Math.random() * 2 + 1);
					health[monster.length - 1] -= randomDmg;
					System.out.println(monster[randomMonster] + "hit you for"
					+ randomDmg + "hp !" + health[monster.length - 1] + "hp left");
				}
				else 
				{
					// player did damage
					System.out.println("player hits with " + abilities[monster.length-1] 
					+ monster[randomMonster] + " runs away. It left " + coins[randomMonster ] + " coins");
					
					int totalCoins = coins[randomMonster];
				}
			} // end of if 
			
			turns ++;
			
		}// end of while 
		 
		  // subtract hp when hit 
		  // add coins when monster killed 
		 // track number of turns
		

	}
}
