package listConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		
	// 1. LinkedHashSet
		
		ArrayList<Integer> duplicate = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,1,4,6,8,9));
		
		LinkedHashSet<Integer> duplicateToHashSet = new LinkedHashSet<>(duplicate);
		
		ArrayList<Integer> duplicateRemoved = new ArrayList<Integer>(duplicateToHashSet);
		
		System.out.println("With Duplicates : "+ duplicate);
		
		System.out.println("After Duplicates are removed : "+duplicateRemoved);
		
		
		//From JDK 8 - stream
		
		ArrayList<Integer> withStream = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,1,4,6,8,9));
		List<Integer> usingStream = withStream.stream().distinct().collect(Collectors.toList());
		System.out.println(usingStream);
		
				
				
		
		

	}

}
