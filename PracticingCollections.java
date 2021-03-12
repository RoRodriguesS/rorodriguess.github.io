/*
 * Part of a practice exercise proposed by Digital Innovation One (DIO) as part of their Inter Java Developer Bootcamp.
 * Allow the user to insert names into a list and then output the chosen names. 
 */

package practicingcollections;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PracticingCollections {
	public static void main(String args[]) {
		
		List <String> list = new ArrayList();
		Scanner userChoice = new Scanner(System.in);
		Scanner userInput = new Scanner(System.in);
		
		//Variable to control the while loop.
		int loopController = 1;
		
		//While loop created to allow the user to choose whether he/she wants to add new names or not.
		while(loopController == 1) {
			System.out.print("Type 1 to register a new name. Type other number to cancel: ");
			loopController = userChoice.nextInt();
			if(loopController == 1) {
				System.out.print("Type a name: ");
				list.add(userInput.nextLine());
			}
			else {
				continue;
			}
		}
		
		//Verify whether the list is empty or not and act properly.
		if(list.isEmpty()) {
			System.out.println("The list is empty");
		}
		else {
			for(String iterator:list) {
				System.out.print(iterator + " ");
			}
		}	
	}
}
