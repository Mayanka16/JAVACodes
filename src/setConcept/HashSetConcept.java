package setConcept;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(1);
		//hs.add(null);
		
		
		System.out.println(hs); //[null, 1, 2, 3]
		
		System.out.println(hs.contains(3)); //true
		
		System.out.println(hs.contains(4)); //false
		
	
		
		for (int e : hs) {
			System.out.println(e); // nullpointer exception due to null
		}
		
		
		Iterator<Integer> e1 = hs.iterator();
		while(e1.hasNext()) {
			System.out.println(e1.next());
		}
		
		hs.remove(3);
		System.out.println(hs);// [1, 2]
		
		
		
		System.out.println("==============================================================");
		// How to add two sets
		
		//Union
		HashSet<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] {1,2,3,4,5}));
		
		
		HashSet<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] {6,7,8,9,10}));
		
		
		HashSet<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);
		
		
		//intersection(common)
		
		HashSet<Integer> third = new HashSet<Integer>();
		third.addAll(Arrays.asList(new Integer[]{1,2,3,4,5}));
		
		
		HashSet<Integer> fourth = new HashSet<Integer>();
		fourth.addAll(Arrays.asList(new Integer[] {4,5,6,7,8}));
		
		
		HashSet<Integer> intersection = new HashSet<Integer>(third);
		intersection.retainAll(fourth);
		System.out.println(intersection);
		
		
		//differences
		
		HashSet<Integer> fifth = new HashSet<Integer>();
		fifth.addAll(Arrays.asList(new Integer[] {2,2,2,2,6,7,8}));
		
		HashSet<Integer> sixth = new HashSet<Integer>();
		sixth.addAll(Arrays.asList(new Integer[] {3,6,2,6,9}));
		
		
		HashSet<Integer> differences = new HashSet<Integer>(fifth);
		differences.removeAll(sixth);
		System.out.println(differences);
		

		
		
	}	
		

	}


