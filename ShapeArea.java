/*
Exercise solved at codesignal.com

Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.

A 1-interesting polygon is just a square with a side of length 1. An n-interesting polygon is obtained by 
taking the n - 1-interesting polygon and appending 1-interesting polygons to its rim, side by side.

So, a n = 2 has area = 5; a n = 3 has area = 13; a n = 4 has area = 25.
*/

// My sollution (Using Java)
public class ShapeArea {
	/*Method created as a static one to facilitate someone elses test.
	 *To test it just call the method by typing: 
	 *System.out.print(ShapeArea.exerciseFiveSolution(value)) at main.
	 *You have to pass an int type value to the method as an argument.
	*/
	public static int exerciseFiveSolution(int n) {
	    int aux = 1;
	    
	    if(n == 1){
	        return 1;
	    }
	    else{
	        for (int i = n; i > 1; i--){
	            aux = aux + ((i - 1) * 4); 
	        }
	    return aux;
	    }   
	}
}