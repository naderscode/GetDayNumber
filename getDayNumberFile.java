/* Date:2/16/2012
// Author: Nader K
// Purpose: This is a method that takes three parameters of month, day , year, and returns 
// 			the day number of the year.
*/

public class getDayNumberFile
{		
	// method getDayNumber()	
	public static int getDayNumber(int m, int d, int y)
	{
			int month = m;
	 		int day = d;
			int year = y;	      
			
			int dayNumber = 0;		// initialize dayNumber
			
			
			// declare months (except feb) as named constants and set values to respective days in each month.
			final int JAN = 31;		
			final int MAR = 31;
			final int APR = 30;
			final int MAY = 31;
			final int JUN = 30;
			final int JUL = 31;
			final int AUG = 31;
			final int SEP = 30;
			final int OCT = 31;
			final int NOV = 30;	
					
			int feb = 28;			//initialize feb to 28
			
			
			switch (month)
			{
	
				case 12: dayNumber += NOV;
				
				case 11: dayNumber += OCT;
				
				case 10: dayNumber += SEP;
				
				case 9:  dayNumber += AUG;
				
				case 8:  dayNumber += JUL;
				
				case 7:  dayNumber += JUN;
				
				case 6:  dayNumber += MAY;
				
				case 5:  dayNumber += APR;
				
				case 4:  dayNumber += MAR;
				
				case 3:  if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)//determine if year is leap 
									feb = 29;														//if so, assign 29 to feb
		
							dayNumber += feb;
							
				case 2:	dayNumber += JAN;
							
				case 1:  dayNumber += day;    //use variable dayNumber as an accumulator
	
			}	
			
			return dayNumber;						//return value of number of the day number of the year
		}
		
}//end class			

	
			