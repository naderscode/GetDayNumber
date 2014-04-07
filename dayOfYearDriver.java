// Written by Nader K 
// 2/16/2012
// Program reads month, day, year and
//			calls validation and calculation routines.


import java.util.*;
class dayOfYearDriver
{
	public static void main(String[] args) 
	{
		int month;
		int day;
		int year;                      // assumed 1000 or more
		boolean inputValid;            // is input valid?
		int dayOfYear;                 // to be calculated
		Scanner console = new Scanner (System.in); // set keyboard as input device
		System.out.print ("Please input month (1-12). ");
		month = console.nextInt();
		System.out.print ("Please input day (1-31, as appropriate to month). ");
		day = console.nextInt();
		System.out.print ("Please input year (1000 or more). ");
		year = console.nextInt();
		inputValid = dateValidation.dateValidationRoutine (month, day, year);
		if (inputValid)
		{
			dayOfYear = getDayNumberFile.getDayNumber (month, day, year);
			System.out.printf ("The serial number of this date is %d.\n", dayOfYear);
		}
		else System.out.println ("Invalid date.");
	}
}

