import java.util.Scanner;

public class Assign5Translator {
	
	Scanner scannums = new Scanner();

	public static void main(String[] args)
	{	
		// init english and french word arrays
		String[] wordEnglish = {"robin","treat","trick","search","circle","whole","five", "pizza","cheese","spaghetti","monkey","horse","dog","cat","juice"};
		String[] wordFrench = {"robin", "friandise", "astuce", "recherche", "cercle", "entier", "cinq", "pizza", "fromage", "spaghetti","singe", "cheval", "chien", "chat", "jus"};
		
		System.out.println("English: 	French:");
		// iterate through and print each word in english and french
		for(int i = 0; i < wordEnglish.length; i ++)
		{
			System.out.printf("%-1s: %-10s %-15s \n",i, wordEnglish[i], wordFrench[i]);
		}
		System.out.println("\nwhat do you want translated? please input the number below");
		

	} // end main

} // end of class 
