package FloorConstructionModel;

public class Progress {

				private int Days;
				private int FloorSize;

				public Progress(int days, int floorSize) //Constructor with parameters
				{
					this.Days = days;
					this.FloorSize = floorSize;
				}

				//Defining Getter and Setter for Private type Variables.
				
				public int getDays() 
				{ 
					return Days; 
				}

				public void setDays(int days)
				{
					this.Days= days;
				}

				public int getFloorSize() 
				{ 
					return FloorSize; 
				}

				public void setFloorSize(int floorSize)
				{
					this.FloorSize= floorSize;
				}
				
								
				@Override 
				public String toString()
				{
					return "[ FloorSize=" + FloorSize+ ", Days=" + Days+ "]";
				}

}


	

