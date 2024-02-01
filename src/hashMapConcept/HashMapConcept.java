package hashMapConcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> marks = new HashMap<String, Integer>();
		
		marks.put("Mayanka",100);
		marks.put("A", 9);
		marks.put("B", 8);
		marks.put(null, null);
		marks.put(null, 6);
		
		System.out.println(marks);
		
		

	}

}
