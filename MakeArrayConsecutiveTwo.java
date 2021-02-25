/*
Exercise solved at codesignal.com

Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, 
each statue having an non-negative integer size. Since he likes to make things perfect, 
he wants to arrange them from smallest to largest so that each statue will be bigger 
than the previous one exactly by 1. He may need some additional statues to be able to 
accomplish that. Help him figure out the minimum number of additional statues needed.

Example:
For statues = [6, 2, 3, 8], the output should be makeArrayConsecutive2(statues) = 3.
*/
import java.util.Random;

public class MakeArrayConsecutiveTwo {
		/*Method created as a static one to facilitate someone elses test.
		 *To test it just call the method by typing: 
		 *System.out.print(MakeArrayConsecutiveTwo.exerciseSixSolution(array)) at main.
		 *You have to pass an array as an argument.
		*/
		// My solution (Using Java)
		public static int exerciseSixSolution(int[] statues) {
		    int min = 0;
		    int max = 0;
		    
		    /*Populate the statues array with random values between 0 and maxNumber and print the 
		     *generated array. Just to facilitate test. Not a part of the given problem.
		     * 
		     *If you want to use your own values just change or comment these lines. 
		     */
		    int maxNumber = 20;
		    Random randNumber = new Random();
		    for(int i = 0; i < statues.length; i++) {
		    	statues[i] = randNumber.nextInt(maxNumber);
		    	System.out.print(statues[i] + " ");
		    }
			System.out.println();
		    
			
			//Solution to the given problem
			//Find the highest value inside the array.
		    for (int i = 0; i < statues.length; i++){
		        if(statues[i] > max){
		            max = statues[i];
		        }
		    }
		    //Find the minimum value inside the array.
		    min = max;
		    for (int j = 0; j < statues.length; j++){
		        if(statues[j] < min){
		            min = statues[j];
		        }
		    }
		    //Return the number of missing elements to achieve the desired sequence asked in the problem.
		    return (max - min + 1) - statues.length;
		}
}