package Collections;

import java.util.Comparator;

public class sortByYear implements Comparator<songs> {

	@Override
	public int compare(songs o1, songs o2) {
		
		if (o1.getYear()< o2.getYear()) 
			return -1;
		else 
			return 1;
	

}
}
