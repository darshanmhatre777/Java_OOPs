package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class songCollections {
	
	public List<songs> initializeSongData(){
		ArrayList<songs> playlist = new ArrayList<>();
		TreeSet<String> artists1 = new TreeSet<>();
		artists1.add("Eminen");
		artists1.add("Arijit Singh");
		
		songs s1 = new songs(101,2018,"",artists1);
		
		TreeSet<String> artists2 = new TreeSet<>();
		artists2.add("Eminen");
		artists2.add("Mc Skull");
		songs s2 = new songs(102,2022,"shady barsaat",artists2);
		
		
		TreeSet<String> artists3 = new TreeSet<>();
		artists3.add("Mc Skull");
		artists3.add("Soham");
		songs s3 = new songs(103,2024,"shaamein",artists3);
		
		
		TreeSet<String> artists4 = new TreeSet<>();
		artists4.add("Mc Skull");
		artists4.add("Arijit Singh");	
		songs s4 = new songs(104,2021,"abc",artists4);
		
		
		playlist.add(s1);
		playlist.add(s2);
		playlist.add(s3);
		playlist.add(s4);
		return playlist;
	}
	
	public List<songs> addtoPlaylist(List<songs> playlist, songs s){
		
		playlist.add(s);
		return playlist;
		
	}
	public List<songs> removeFromPlaylist(List<songs> playlist, songs s){
		
		playlist.remove(s);
		return playlist;
		
	}
	
	public songs getsongs(List<songs> playlist, String title) {
		for(songs song: playlist) {
			if(song.getTitle().equals(title) ) {
				return song;
			}
		}
		return null;
	}
	
	public void printsongs(List<songs> playlist){
		for(songs song: playlist) {
			System.out.println(song);
		}
	}
	
	public List<songs> searchByTitle(List<songs> playlist, String title){
		List<songs> search = new ArrayList<>();
		for(songs song : playlist) {
			if(song.getTitle().contains(title)) {
				search.add(song);
			}
		}
		return search;
	}
	
	public List<songs> filterlistByArtist(List<songs> playlist, String artist){
		List<songs> artistSearch = new ArrayList<>();
		for(songs song: playlist) {
			if(song.getArtists().contains(artist)) {
				artistSearch.add(song);
			}
		}
		return artistSearch;
		
	}
	
}

