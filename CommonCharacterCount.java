/*
Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
commonCharacterCount(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".
*/

//My solution
public class CommonCharacterCount{
//Method modified to public static to facilitate test.
//To test it, call the method at main passing two string as arguments.
	public static int commonCharacterCount(String s1, String s2) {
	    int count = 0;
	    int auxArray[] = new int[s2.length()];
	    for (int i = 0; i < auxArray.length; i++){
		auxArray[i] = 0;
	    }
	    
	    for(int i = 0; i < s1.length(); i++){
		for(int j = 0; j < s2.length(); j++){
		    if( auxArray[j] == 1){
		        continue;
		    }
		    else{
		        if(s1.charAt(i) == s2.charAt(j)){
		            auxArray[j] = 1;
		            count += 1;
		            break;
		        }
		    }
		}
	    }
	    return count;
	}
}
