package Collections;

import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		songCollections s1 = new songCollections();
		List<songs> playlist = s1.initializeSongData();
		
		System.out.println(" 1. List of songs : ");
		
		s1.printsongs(playlist);
		System.out.println("-----------------------------------------------");
		
		System.out.println(" 2. Sorting songs by title : ");
		
		Collections.sort(playlist, new sortByTitle());
		for(songs song: playlist) {
			System.out.println(playlist);
		}
		
		System.out.println("--------------------------------------------------");
		
		System.out.println(" 3. Sorting by release year: ");
		
		Collections.sort(playlist, new sortByYear());
		for(songs song: playlist) {
			System.out.println(playlist);
		}
		
		System.out.println("------------------------------------------------------");
		
		System.out.println(" 4. Search by title : ");
		System.out.println(s1.searchByTitle(playlist, "shaamein"));
		
		System.out.println("-----------------------------------------------------------");
		
		System.out.println(" 6. Artist ");
		
		System.out.println(s1.filterlistByArtist(playlist, "Mc Skull"));

		
		System.out.println("7. list of songs by release year and title");
		for(songs song:playlist) {
			System.out.println(song.getYear() + " :: " + song.getTitle());
			
		}
		
		
		

	}

}
