/*
 * Small exercise with the Set interface proposed by Digital Innovation One (DIO) as part of their Inter Java Developer Bootcamp.
 */

package practicingcollections;

import java.util.HashSet;
import java.util.Set;

public class PracticingSet {
	public static void main (String args[]) {
		Set <Integer> intSet = new HashSet();
		
		intSet.add(3);
		intSet.add(88);
		intSet.add(20);
		intSet.add(44);
		intSet.add(3);
		
		for(Integer iterator : intSet) {
			System.out.print(iterator + " ");
		}
		System.out.println("");
		
		intSet.remove(3);
		
		System.out.println(intSet.size());
		
		System.out.println(intSet.isEmpty());
			
	}
}
