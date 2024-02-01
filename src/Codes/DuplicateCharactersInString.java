package Codes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersInString {

		
		public static void charSeq(String str) {
			//String str1 = str.toLowerCase();
			//String str2 = str1.replaceAll(" ", "");
			if(str == null) {
				System.out.println("Null String");
				return;
			}
			if(str.isEmpty()) {
				System.out.println("Empty String");
				return;
				
			}
			if(str.length()==1) {
				System.out.println("Single Char String");
				return;
			}
			
			Map<Character, Integer> charnumber = new HashMap<Character, Integer>();
			char charnumbertoarray[] = str.toCharArray();
			for (char charsequence : charnumbertoarray) {
				if(!String.valueOf(charsequence).isBlank())
				if(charnumber.containsKey(charsequence)) {
					charnumber.put(charsequence, charnumber.get(charsequence)+1);
				}
				else {
					charnumber.put(charsequence, 1);
				}
			}
			
			Set<Map.Entry<Character, Integer>> entrySet = charnumber.entrySet();
			for (Map.Entry<Character, Integer> entry : entrySet) {
				if(entry.getValue()>1) {
					System.out.println("Duplicate character is - "+entry.getKey() +" : "+ entry.getValue());
				}
				
			}
			//System.out.println(str +  " : " + charnumber);
		}
			
			
			public static void main(String[] args) {
				charSeq("Mayanka");
				charSeq("mayanka Sao");
				charSeq(null);
				charSeq("");
				charSeq("a");
				charSeq("aa44453e5queygeqjhfteqjgefyuqjghF");
		
	}

}
