import java.util.Random;

public class thatfuckingarraytho 

{
	public static void main(String[] args)
	{
		Random randy = new Random();
		
		
		int[] gradesArray = new int[nameArray.length];
		int average = 0;
		
		for(int i = 0; i < gradesArray.length; i ++)
		{
			gradesArray[i] = randy.nextInt(101);
		}
		
		for(int i = 0; i < gradesArray.length; i ++)
		{
			average += gradesArray[i];
		}
		
		// divide the average by amount of values
		average = average/gradesArray.length;
		
		for(int i = 0; i < nameArray.length; i ++)
		{
			System.out.println("Name: " + nameArray[i] + " Grade: " + gradesArray[i]);
			
		}
		System.out.println("class average:" + average);
	}

}
