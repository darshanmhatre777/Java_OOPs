package Collections;

import java.util.TreeSet;

public class songs {
	
	private int srNo;
	private int year;
	private String Title;
	TreeSet <String> artists;
	
	public songs(int srNo, int year, String title, TreeSet<String> artists) {
		super();
		this.srNo = srNo;
		this.year = year;
		Title = title;
		this.artists = artists;
	}

	public int getSrNo() {
		return srNo;
	}

	public int getYear() {
		return year;
	}

	public String getTitle() {
		return Title;
	}

	public TreeSet<String> getArtists() {
		return artists;
	}

	@Override
	public String toString() {
		return "songs [srNo=" + srNo + ", year=" + year + ", Title=" + Title + ", artists=" + artists + "]";
	}
	
	

}
