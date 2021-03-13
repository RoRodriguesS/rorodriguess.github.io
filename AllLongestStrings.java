package alllongeststring;

/*
Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
allLongestStrings(inputArray) = ["aba", "vcd", "aba"].

*/
public class AllLongestStrings{
	/*Method created as static to facilitate use. One way to test it is to 
	  create two arrays of Strings at main. One to be passed as
	  argument to this method and another to be used as reference to the 
	  return of the method. Then, use a loop to output the result. 
	*/
	public static String[] exerciseNineSollution(String[] inputArray) {
	    int auxVar = inputArray[0].length();
	    int count = 0;
	    int l = 0;
	    //Find the longest string at the given array.
	    for(int i = 0; i < inputArray.length; i++){
			if(inputArray[i].length() > auxVar){
			    auxVar = inputArray[i].length();
			}
	    }
	    //Count the number of strings which has the same length as the longest one.
	    for(int j = 0; j < inputArray.length; j++){
			if(inputArray[j].length() == auxVar){
			    count += 1;
			}
	    }
	    //Initialize the new array and save the longest strings into it.
	    String returnArray[] = new String[count];
	    for(int k = 0; k < inputArray.length; k++){
			if(inputArray[k].length() == auxVar){
			    returnArray[l] = inputArray[k];
			    l += 1;
			}
	    }
	    return returnArray;
	}
}
