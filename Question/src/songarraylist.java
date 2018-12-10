import java.util.ArrayList;
import java.util.Arrays;
public class songarraylist 
{
	
	// create list of songs 
	static String[] songslist = {"Thank U, Next", "Sicko Mode", "Happier", "Without Me","Lucid Dreams",
						  "High Hopes", "Mo Bamba", "Girls Like You", "Drip Too Hard", "Breathin"};
	
	// create a list of artists to match respective songs above
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
	static ArrayList<String> partyPlayList = new ArrayList<>();
	
	
	
	
	// method to print out the songs
	public static void PrintSongs() 
	{
		for(int i = 0; i < ListofSongs.size(); i ++ )
		{
			// print it out in formatted way
			System.out.printf("%s: Song: %-22s Artist: %-20s \n", i + 1, ListofArtists.get(i),  ListofSongs.get(i));
		}
	} // end of method print songs
		
	
	public static void main(String[] args)
	{
		// print out message and songs
		System.out.println("Welcome to the ultimate music experience xp");
		System.out.println("Printing available songs... \n");
		PrintSongs();
	} // end main

} // end class


