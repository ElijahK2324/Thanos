import java.util.ArrayList;

public class arraylists 
{
	
	public static void main(String[] args)
	{
		
		ArrayList<Integer> ListofInts = new ArrayList<>();
		
		//methods in array list
		
		// add to the list 
		ListofInts.add(98); // adds to arrays
		ListofInts.add(55); // adds to arrays
		ListofInts.add(2,678); // add to specific index of array
		ListofInts.remove(0); // remove item at first index
		ListofInts.get(0); // returns index 0
		for(int i = 0; i < ListofInts.size(); i ++)
		{
			System.out.println(ListofInts.get(i));
		}
	}

}
