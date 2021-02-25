package matrixsum;

import java.util.Random;
public class MatrixElementsSum {
	/*
	After becoming famous, the CodeBots decided to move into a new building together. Each of the rooms 
	has a different cost, and some of them are free, but there's a rumour that all the free rooms are 
	haunted! Since the CodeBots are quite superstitious, they refuse to stay in any of the free rooms, or 
	any of the rooms below any of the free rooms.

	Given matrix, a rectangular matrix of integers, where each value represents the cost of the room, 
	your task is to return the total sum of all rooms that are suitable for the CodeBots (ie: add up all 
	the values that don't appear below a 0).
	*/

	
	/* Declared as a static method just to facilitate test.
	 * To call it at main just type: System.out.println(MatrixElementsSum.exerciseEightSolution(matriz));
	 * You have to pass a matrix as argument
	*/
	// My solution (Using Java)
	public static int exerciseEightSolution(int[][] matrix) {
	    int sum = 0;
	    
	    /*Populate the matrix with random values between 0 and maxNumber and print the 
	     *generated matrix. Just to facilitate test. Not a part of the given problem.
	     * 
	     *If you want to use your own values just change or comment these lines. 
	     */
	    int maxNumber = 5;
	    Random randNumber = new Random();
	    for(int i = 0; i < matrix.length; i++) {
	    	for  (int j = 0; j < matrix[0].length; j++) {
	    		matrix[i][j] = randNumber.nextInt(maxNumber);
	    		System.out.print(matrix[i][j] + " ");
	    	}
	    	System.out.println();
	    }
		System.out.println();

	//My solution for the problem.
	//Iterate through the matrix. If a 0 is found, all the "rooms" below it receive 0.
	    for(int i = 0; i < matrix.length; i++){
	        for(int j = 0; j < matrix[i].length; j++){
	            if(matrix[i][j] == 0){
	                int aux = i;
	                while(aux < matrix.length){
	                    matrix[aux][j] = 0;
	                    aux += 1;
	                }
	            }
	        }
	    }

	//Store the sum of valid room values.
	    for(int i = 0; i < matrix.length; i++){
	        for(int j = 0; j < matrix[i].length; j++){
	            sum += matrix[i][j];
	        }
	    }
	    
	    return sum;
	}
}