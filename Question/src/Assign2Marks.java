public class Assign2Marks 
{
	public static void main(String[] args) {
		// init names list and fill it
		String[] names = {"Kris", "Kim", "Lam", "Shantae","Bobette","Jerry"};
		
		// init grade number
		int[] gradeNum = new int[names.length];
		
		// init exam1, 2 and 3 variables
		int[] exam1 = new int[names.length];
		int[] exam2 = new int[names.length];
		int[] exam3 = new int[names.length];
		
		// init average
		double average = 0;
		
		for(int i = 0; i < names.length; i ++)
		{
			// set grade number to a random value between 12 and 10
			gradeNum[i] = (int)(Math.random() * 2) + 10;
			
			/// set it all exam marks and grades to random values 
			exam1[i] = (int)(Math.random() * 100);
			exam2[i] = (int)(Math.random() * 100);
			exam3[i] = (int)(Math.random() * 100);
			

		}
		
		for(int i = 0; i < names.length; i ++)
		{
			// print the names of all students who got more than 79 %
			if(exam3[i] > 79)
			{
				System.out.println(names[i] + " got 80 or above on exam 3 ");
			}// end of if
			
			// if exam 1 is less than 50 make it 40 
			if(exam1[i] < 50)
			{
				exam1[i] = 40;
			} // end of if
			
		} // end of for 
		
		for(int i = 0; i < names.length; i ++)
		{
			// calculate the average exam grade per person
			average = (exam1[i] + exam2[i] + exam3[i]) / 3;
			
			// print number 1, 2 3... before hand                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
			System.out.println(i + 1 + ":");
			
			// print the name, grade, and exam 1,2 and 3 grades
			System.out.println("Name: " + names[i]);
			System.out.println("Grade: " + gradeNum[i]);
			System.out.println("Exam 1 grade: " + exam1[i]);
			System.out.println("Exam 2 grade: " + exam2[i]);
			System.out.println("Exam 3 grade: " + exam3[i]);
			
			// print the grade average and names
			System.out.println(names[i] + "'s average grade is "  + average);
			System.out.print("\n");
			
		} // end of for
		
	} // end of main

}// end of class
