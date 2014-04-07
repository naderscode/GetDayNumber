// Written by Nader K 
// 2/16/2012


public class dateValidation
{
	/*
		Given month (mm), day (dd), year (yy), validates the date.  Written by E. Williams
		February 2012
	*/
	public static boolean dateValidationRoutine (int mm, int dd, int yy)
		{
		 final int ARBITRARY_LOWER_LIMIT = 1000;
		 boolean monthValid;
		 boolean dayValid;
		 boolean yearValid;
		 boolean allValid;
		 monthValid = mm >= 1 && mm <= 12;
		 switch (mm)
		 {
			case 4:
			case 6:
			case 9:
			case 11: dayValid = dd >= 1 && dd <= 30; //thirty days hath September, April, June, and November...
			break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: dayValid = dd >= 1 && dd <= 31;  // all the rest have 31...
			break;
			case 2:  dayValid = dd >= 1 && dd <= 29;  // excepting February alone...
			break;
			default: dayValid = false;
		 }
		 yearValid = yy >= ARBITRARY_LOWER_LIMIT;
		 allValid = monthValid && dayValid && yearValid;
		 return allValid;
		}
}

