package exercise8;
import java.util.ArrayList;
import java.util.Iterator;
import exercise7.WeightMars;


public class List {
	public List(){
		WeightMars wom1 = new WeightMars(47);
		WeightMars wom2 = new WeightMars(50);
		WeightMars wom3 = new WeightMars(80);

		ArrayList<WeightMars> weightlist = new ArrayList<WeightMars>();

		weightlist.add(wom1);
		weightlist.add(wom2);
		weightlist.add(wom3);

		Iterator<WeightMars> weightIt = weightlist.iterator();
		while (weightIt.hasNext()) {
			weightIt.next().calculateWeight();
		}
	}

}
