import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class gucci 
{

		// create list of songs 
		static String[] songslist = {"Thank U, Next", "Sicko Mode", "Happier", "Without Me","Lucid Dreams",
							  "High Hopes", "Mo Bamba", "Girls Like You", "Drip Too Hard", "Breathin"};
		
		// create a list of ListofArtists to match respective songs above
		static String[] artistlist = {"Ariana Grande", "Travis Scott", "Marshmello ", "Halsey","Juice WRLD",
				               "Panic! At The Disco", "Sheck Wes", "Maroon 5 ", "Lil Baby & Gunna","Ariana Grande"};
		
		 // create all arrays for songs and stuff
		// convert lists from earlier to arrays
		/*
		 * These are better than regular arrays cause
		 * they can easily be changed added to or taken from
		 * For arrays if items are removed it could leave
		 * empty spaces and stuff
		 */
		static ArrayList<String> ListofSongs = new ArrayList<>(Arrays.asList(songslist));
		static ArrayList<String> ListofArtists = new ArrayList<>(Arrays.asList(artistlist));
		static ArrayList<String> partyPlaylist = new ArrayList<>();
		
		// method to print out the songs
		public static void PrintSongs() 
		{
			for(int i = 0; i < ListofSongs.size(); i ++ )
			{
				// print it out in formatted way
				System.out.printf("%s: Song: %-22s Artist: %-20s \n", i + 1, ListofSongs.get(i), ListofArtists.get(i)  );
			}
		} // end of method print songs
		
		
		
	// main method
	public static void main(String[] args) 
	{
		
		// print out message and songs
		System.out.println("Welcome to the ultimate music experience xp");
		System.out.println("Printing available songs... \n");
		PrintSongs();
		
		System.out.println("\n");
		
		System.out.println("1. add to library \n" + 
		                   "2. delete from library \n" +
						   "3. add to playlist \n" +
		                   "4. print songs list" + 
		                   "5. exit");
		
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		boolean flag = true;
		
		switch(choice)
		{
		case 1:
			// add song to list
			input.nextLine();
			System.out.println("enter song name");
			ListofSongs.add(input.nextLine());
			System.out.println("enter artist:");
			ListofArtists.add(input.nextLine());
			break;
			
		case 2:
			// delete song from playlist
			System.out.println("enter song number to delete");
			int delete = input.nextInt();
			if(delete > ListofSongs.size()) {
				// if user enters invalid number or input
				System.out.println("error not in song index. returning to menu...");
			}
			else 
			{
				// delete songs from the list if they are in its index
				ListofSongs.remove(delete);
				ListofArtists.remove(delete);
			}
			break;
		
		case 3:
			// add song to playlist
			System.out.println("enter song # to add to party playlist:");
			int number = input.nextInt();
			if(number > ListofSongs.size())
			{
				System.out.println("error! invalid input. returning to menu...");
			}
			else 
			{
				System.out.println("song has been added to playlist");
				partyPlaylist.add(ListofSongs.get(number));
			}
			break;
			
		case 4:
			PrintSongs();
			break;
			
		case 5:
			System.out.println("Cya!");
			flag = false;
			break;
			
		default:	
			System.out.println("invalid input");
			break; 
			
		}// end of switch case
		
		
		// print space
		System.out.print('\n');
		
		
		while(flag)
		{

			System.out.println("\n");
			
			System.out.println("1. add to library \n" + 
			                   "2. delete from library \n" +
							   "3. add to playlist \n" +
			                   "4. print songs list \n" + 
			                   "5. exit");
			
			 choice = input.nextInt();
			 
			 switch(choice)
				{
				case 1:
					// add song to list
					input.nextLine();
					System.out.println("enter song name");
					ListofSongs.add(input.nextLine());
					System.out.println("enter artist:");
					ListofArtists.add(input.nextLine());
					break;
					
				case 2:
					System.out.println("enter song number to delete");
					int delete = input.nextInt();
					if(delete > ListofSongs.size())
					{
						System.out.println("invalid input entered. returning to menu...");
					}
					else 
					{
						ListofSongs.remove(delete);
						ListofArtists.remove(delete);
					}
					
					break;
				
				case 3:
					// add song to playlist
					System.out.println("enter song # to add to party playlist:");
					int number = input.nextInt();
					if(number > ListofSongs.size())
					{
						System.out.println("error! invalid input. returning to menu...");
					}
					else 
					{
						System.out.println("song has been added to playlist");
						partyPlaylist.add(ListofSongs.get(number));
					}
					break;
					
				case 4:
					PrintSongs();
					break;
					
				case 5:
					System.out.println("Cya!");
					flag = false;
					break;
					
				default:	
					System.out.println("invalid input");
					break; 
					
				}// end of switch case
		}
		
		System.out.print('\n');
		
	} // end of main

} // end of class
