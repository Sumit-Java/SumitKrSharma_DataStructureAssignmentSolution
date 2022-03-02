package Driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import FloorConstructionModel.ComparatorSorting;
import FloorConstructionModel.Progress;

class Construction {

			public static void main(String args[]) throws NullPointerException
			{
				
				// ArrayList to store the Class Progress Objects having inputs for 
				//Floor Size Day-wise.
				
				ArrayList<Progress> DailyProgress	= new ArrayList<Progress>();
				
				Queue<Integer> Day= new LinkedList<>();
				Queue<Integer> Size= new LinkedList<>();
				
				//Accepting inputs from user for total No of Floor in the Building.
				System.out.print(" Please Enter the Total No Of Floors :");
				
				Scanner input=new Scanner(System.in);
				int Floors= input.nextInt();
				
				// Inputs from user on floor Size day-wise and Storing the same in Array List.
				
				for(int i=1; i<= Floors;i++) 
				{
					System.out.print(" Please Enter the FLoor Size received on Day "+ i + ": ");
					
					Progress P =new Progress(i, input.nextInt());
										
					DailyProgress.add(P);
				}
					
					
			// Sorting on Floor Size 
				
		
				Collections.sort(DailyProgress, ComparatorSorting.dailysize);
				
					
			//Copying Sorted ArrayList to Queues Separately 
				
			for(int i=0; i<DailyProgress.size(); i++) 
				{
					Size.add(DailyProgress.get(i).getFloorSize());
					Day.add(DailyProgress.get(i).getDays());
				
				}
						
			// Condition to check the daily Construction status according to 
			//Material availability. 	
					
		try {
			for( int i=1; i<=Floors;)
			   {
				System.out.println("Day"+"["+i+"]: ");
								
					if(Day.peek()<=i && Day.peek()!=null)
						{
						
							do {
								System.out.print(Size.poll() +" ");
								Day.poll();
								}
							while(Day.peek()<=i && Day.peek()!=null);
					
							System.out.println();
							i++;
					
						}
					
					else
						{ i++;
						continue;
						}
				
			   	}
			}
		
		catch(NullPointerException e)
			{
			System.out.println();	
			System.out.println("Null Point Exception Caught");
			}
				
				System.out.println(Size);

	}
}

		
		

