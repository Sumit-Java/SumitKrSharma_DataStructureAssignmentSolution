package FloorConstructionModel;

import java.util.Comparator;

public class ComparatorSorting {

	// Comparator for sorting the list by Floor Size
	
	public static Comparator<Progress> dailysize = new Comparator<Progress>() 
	{
			public int compare(Progress s1, Progress s2)
			{
				int FloorSize1 = s1.getFloorSize();
				int FloorSize2 = s2.getFloorSize();

				//Keeping the result in Descending order.
				return FloorSize2-FloorSize1;
			}
	};

}
