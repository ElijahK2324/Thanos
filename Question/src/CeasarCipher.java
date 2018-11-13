// import java scanner
import java.util.Scanner;

public class CeasarCipher {
	
	
	// create new scanners one for words another for numbers
	static Scanner scanwords = new Scanner(System.in);
	static Scanner scannums = new Scanner(System.in);
	
	public static String encrypt(String input, int shiftValue)
	{
		// initalize output
		String output = "";
		
		/*
		 * iterate through the for loop and change every letter into a char value
		 * shift the value of the chars to encrypt and return it back as a string
		 */
		for(int i = 0; i < input.length(); i ++) {
			char encrypted = (char) (input.charAt(i) + shiftValue); 
			output += String.valueOf(encrypted);
		}
		
		// return the output
		return output;
		
	} // end of encrypt

	public static String decrypt(String encryptedText, int shiftValue)
	{
		// initalize output
		String output = "";
		
		/*
		 * iterate through the for loop and change every letter into a char value
		 * shift the value of the chars to dencrpyt and return it back as a string
		 */
		for(int i = 0 ; i < encryptedText.length() ; i ++) {
			char dencrypted = (char) (encryptedText.charAt(i) - shiftValue); 
			output += String.valueOf(dencrypted);
		}
		
		// return output
		return output;
	} // end of decrypt 
	
	
	public static void main(String[] args) {
		// prompt the user for a word to encrypt
		System.out.println("what do you want to encrypt? \nplease do not put punctutation");
		// store that in a variable and encrpyt it 
		String word = encrypt(scanwords.nextLine(),5);
		// print the encrypted word
		System.out.println("that word encrypted is: " + word);
		
		
		// dencrypt the word again and store in a variable
		System.out.println("\nlets decrypt it again");
		word = decrypt(word,5);
		// print the encrypted
		System.out.println("the word decrypted again  is: " + word);
		
		
		
		
	} // end of main

} // end of class

/// OUTPUT
/**
what do you want to encrypt? 
please do not put punctutation
123
that word encrypted is: 678
lets decrypt it again
the word decrypted is: 123
*/
