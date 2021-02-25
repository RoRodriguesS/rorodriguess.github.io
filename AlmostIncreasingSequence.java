package almostIncreasingSequence;

import java.util.Random;
public class AlmostIncreasingSequence {
	/*
	Exercise solved at Codesignal.com

	Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing 
	sequence by removing no more than one element from the array.

	Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. Sequence 
	containing only one element is also considered to be strictly increasing.
	*/

	// My solution (Using Java)
	public static boolean exerciseSevenSolution(int[] sequence) {
	    int aux = 0;
	    int pos = 0;
	    
	    /*Populate the sequence array with random values between 0 and maxNumber and print the 
	     *generated array. Just to facilitate test. Not a part of the given problem.
	     * 
	     *If you want to use your own values just change or comment these lines. 
	     */
	    int maxNumber = 10;
	    Random randNumber = new Random();
	    for(int i = 0; i < sequence.length; i++) {
	    	sequence[i] = randNumber.nextInt(maxNumber);
	    	System.out.print(sequence[i] + " ");
	    }
		System.out.println();
	    
		//My solution to the problem
	    for(int i = 0; i < sequence.length - 1; i++){
	        for(int j = i+1; j < sequence.length; j++){
	        	//Guarantee that a repeated element is not checked twice.
	            if(pos == j){
	                continue;
	            }
	            //If i > i+1 aux is incremented. aux >= 2 means that we don't have an almostIncreasingSequence. This condition is verified below. 
	            if(sequence[i] > sequence[j]){
	                aux += 1;
	                break;
	            }
	            //Store the position of the repeated element so that element will be ignored in subsequent iterations. This simulates an element removal.
	            else if(sequence[i] == sequence[j]){
	                pos = j;
	                aux += 1;
	            }
	        }
	        if(aux >= 2){
	            break;
	        }
	    }
	    
	    if(aux < 2){
	        return true;
	    }
	    else{
	        return false;
	    }
	}
}