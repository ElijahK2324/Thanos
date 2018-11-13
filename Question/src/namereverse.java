import java.util.Scanner;

public class namereverse 
{
		
	static Scanner scanwords = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("what is your name?");
		String name = scanwords.nextLine();
		System.out.println("This is your name backwards");
		
		for(int i = name.length() - 1; i >= 0; i --)
		{
			System.out.print(name.charAt(i));
		}
			
	}
}

/* OUTPUT
 * what is your name?
 * > marc
 * this is your name backwards
 * cram
 */



