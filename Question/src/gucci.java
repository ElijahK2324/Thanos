import java.util.ArrayList;
import java.util.Scanner;

public class gucci 
{

	public static void main(String[] args) 
	{
		ArrayList<String> allSongs = new ArrayList<>();
		ArrayList<String> artists = new ArrayList<>();
		ArrayList<String> partyPlaylist = new ArrayList<>();
		
		
		// add to array list
		allSongs.add("Everytime we touch");
		artists.add("Cascada");
		
		allSongs.add("Mom's Spaghetti");
		artists.add("Eminem");
		
		allSongs.add("Hips Don't Lie");
		artists.add("Shikira");
		
		for(int i = 0; i < allSongs.size(); i ++) {
			System.out.println(i + " " + allSongs.get(i) + " " + artists.get(i));
			
		}
		System.out.println("\n");
		
		System.out.println("1. add to library \n" + 
		                   "2. delete from library \n" +
						   "3. add to playlist \n" +
		                   "4. exit");
		
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		boolean flag = true;
		
		switch(choice)
		{
		case 1:
			// add song to list
			input.nextLine();
			System.out.println("enter song name");
			allSongs.add(input.nextLine());
			System.out.println("enter artist:");
			artists.add(input.nextLine());
			break;
			
		case 2:
			System.out.println("enter song number to delete");
			int delete = input.nextInt();
			allSongs.remove(delete);
			artists.remove(delete);
			break;
		
		case 3:
			System.out.println("enter song # to add to party playlist:");
			partyPlaylist.add(allSongs.get(input.nextInt()));
			break;
			
		case 4:
			System.out.println("Cya!");
			flag = false;
			break;
			
		default:	
			System.out.println("invalid input");
			break; 
			
		}// end of switch case
		System.out.println('\n');
		
		//
		for(int i = 0; i < allSongs.size(); i ++) {
			System.out.println(i + " " + allSongs.get(i) + " " + artists.get(i));	
		} while(flag);
		
		System.out.println('\n');
		
	} // end of main

} // end of class
