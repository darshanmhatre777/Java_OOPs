package Collections;

import java.util.Comparator;

public class sortByTitle implements Comparator <songs> {

	@Override
	public int compare(songs o1, songs o2) {
		
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
