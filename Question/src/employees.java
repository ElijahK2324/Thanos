
public class employees {

	public static void main(String[] args) {

		String[] employeeName =  {"Tom", "Tommy", "Tomas", "Thom", "Tommaso"};
		int[] wage = {13,14,15,16,17} ;
		int[] hoursWorked = {21,9,6,20,15};
		
		for(int i = 0; i < wage.length; i ++)
		{
			System.out.println("i: " + i + "Name: " + employeeName[i] + "\twage " + wage[i]);
		}
		
		for(int i = 0; i < wage.length; i ++)
		{
			System.out.println("i: " + i + "Name: " + employeeName[i] + "\twage " + wage[i]);
		}
	}

}
