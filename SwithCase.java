package SwitchCase;

import java.util.Scanner;

public class SwithCase {
	
	public static void main(String[] args) {
		
		int iMonth;									//Declaring variable to accept input.
		Scanner sC = new Scanner(System.in);		//Creating an object of scanner to accept input. 
		
		System.out.println("1.  January.");			// This section displays Menu.
		System.out.println("2.  Febraury.");
		System.out.println("3.  March.");
		System.out.println("4.  April.");
		System.out.println("5.  May.");
		System.out.println("6.  June.");
		System.out.println("7.  July.");
		System.out.println("8.  August.");
		System.out.println("9.  September.");
		System.out.println("10. October.");
		System.out.println("11. November.");
		System.out.println("12. December.");
		
		System.out.println("Please enter the month in no format for which you would like to know the number of days:");
		iMonth = sC.nextInt();					// Accepts switch value.

		switch(iMonth)
		{
		
			case 1: System.out.println("January has 31 days.");											// This is the case section and displays as per user's choice.
					break;
			
			case 2: System.out.println("Febraury has 28 days and 29 day in leap year.");
					break;
					
			case 3: System.out.println("March has 31 days.");
					break;
					
			case 4: System.out.println("April has 30 days.");
					break;
					
			case 5: System.out.println("May has 31 days.");
			    	break;
			    
			case 6: System.out.println("June has 30 days.");
			    	break;
			    	
			case 7: System.out.println("July has 31 days.");
					break;
			
			case 8: System.out.println("August has 31 days.");
					break;
					
			case 9: System.out.println("September has 30 days.");
					break;

			case 10: System.out.println("October has 31 days.");
					 break;

			case 11: System.out.println("November has 30 days.");
					 break;
			
			case 12: System.out.println("December has 31 days.");
					 break;
			
			default: System.out.println("Invalid Month Selected By You.");
					break;
					
		}
	}

}
