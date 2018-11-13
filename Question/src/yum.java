import java.util.Scanner;


public class yum {

	public static void main(String[] args)
	{	
		// init english and french word arrays
		String[] wordEnglish = {"robin","treat","trick","search","circle","whole","five", "pizza","cheese","spaghetti","monkey","horse","dog","cat","juice"};
		String[] wordFrench = {"robin", "friandise", "astuce", "recherche", "cercle", "entier", "cinq", "pizza", "fromage", "spaghetti","singe", "cheval", "chien", "chat", "jus"};
		
		
		// iterate through and print each word in english and french
		for(int i = 0; i < wordEnglish.length; i ++)
		{
			
			System.out.printf("English: %-10s French: %-10s \n", wordEnglish[i], wordFrench[i]);
		}

	} // end main

} // end of class 
