/*
Statement of the exercise:
A client has 10 days to pay a bank slip after the expiration date without having to pay fees;
In case the expiration date occurs on a weekend, the client is able to pay the bank slip on the next
business day without having to pay any fee;
Task:
Create a program that receives an expiration date and calculate how many days the customer has to pay it.
*/
package practicingdate;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class PracticingCalendar {
	public static void main(String args[]) {
		//One Calendar object to hold the present date and another to hold the expiration date informed by the user.
		Calendar presentDate = Calendar.getInstance();
		Calendar informedExpiration = Calendar.getInstance();
		
		//Date object to output the expiration date of the bank slip at the end of the program.
		Date expirationDate = new Date();
		Scanner userInput = new Scanner (System.in);
		
		//Output the present date
		//Small adjustment in the Calendar.MONTH return in order to output month values between 1 and 12.
		System.out.println("Today's date: " + presentDate.get(Calendar.YEAR) + " " + (presentDate.get(Calendar.MONTH) + 1) + " " + presentDate.get(Calendar.DAY_OF_MONTH));
		
		//Get user inputs: year, month and day.
		System.out.println("Type the expiration Year: ");
		informedExpiration.set(Calendar.YEAR, Integer.parseInt(userInput.nextLine()));
		System.out.println("Type the expiration Month: ");
		informedExpiration.set(Calendar.MONTH, Integer.parseInt(userInput.nextLine()));
		System.out.println("Type the expiration Day: ");
		informedExpiration.set(Calendar.DAY_OF_MONTH, Integer.parseInt(userInput.nextLine()));
		
		//Small adjustment in the Calendar.MONTH in order to register month between 0 and 11.
		informedExpiration.add(Calendar.MONTH, -1);
	
		System.out.println("Informed expiration date: " + informedExpiration.get(Calendar.YEAR) + " " + (informedExpiration.get(Calendar.MONTH) + 1) + " " + informedExpiration.get(Calendar.DAY_OF_MONTH));
		
		//Adds 10 days to the expiration date informed and verify if the new expiration date will occur on a weekend. If yes, the expire date is changed to the next business day.
		if( (informedExpiration.get(Calendar.YEAR) == presentDate.get(Calendar.YEAR)) && (informedExpiration.get(Calendar.DAY_OF_YEAR) >= presentDate.get(Calendar.DAY_OF_YEAR) - 10) ) {
			informedExpiration.add(Calendar.DAY_OF_YEAR, 10);
			
			if(informedExpiration.get(Calendar.DAY_OF_WEEK) == 1) {
				informedExpiration.add(Calendar.DAY_OF_MONTH, 1);
			}
			else if(informedExpiration.get(Calendar.DAY_OF_WEEK) == 7) {
				informedExpiration.add(Calendar.DAY_OF_MONTH, 2);
			}
			expirationDate = informedExpiration.getTime();
			System.out.println("The bank slip expiration date is: " + expirationDate.toString().substring(0, 10));
		}
		
		//Considering the date informed by the user and the present date, verify if the bank slip is already expired.
		else if(informedExpiration.get(Calendar.YEAR) == presentDate.get(Calendar.YEAR) && informedExpiration.get(Calendar.DAY_OF_YEAR) < (presentDate.get(Calendar.DAY_OF_YEAR) - 10) ) {
			System.out.println("Bank slip expired.");
		}
		
		//Particular case where the informed date corresponds to the last days of December and the present date to the first days of January.
		else if( (informedExpiration.before(presentDate) == true) && (informedExpiration.get(Calendar.MONTH) == 12) && (presentDate.get(Calendar.MONTH) == 1) )  {
			informedExpiration.add(Calendar.DAY_OF_YEAR, 10);
			
			if( (informedExpiration.get(Calendar.DAY_OF_YEAR) < 10) && (informedExpiration.get(Calendar.DAY_OF_YEAR) < presentDate.get(Calendar.DAY_OF_YEAR) - 10) ) {
				System.out.println("Bank slip expired.");
				informedExpiration.add(Calendar.DAY_OF_YEAR, -10);
			}
			else {
				informedExpiration.add(Calendar.DAY_OF_YEAR, 10);
				
				if(informedExpiration.get(Calendar.DAY_OF_WEEK) == 1) {
					informedExpiration.add(Calendar.DAY_OF_MONTH, 1);
				}
				else if(informedExpiration.get(Calendar.DAY_OF_WEEK) == 7) {
					informedExpiration.add(Calendar.DAY_OF_MONTH, 2);
				}
				expirationDate = informedExpiration.getTime();
				System.out.println("The bank slip expiration date is: " + expirationDate);
			}
		}
		
		else {
			System.out.println("Bank slip expired.");
		}
	}
}
