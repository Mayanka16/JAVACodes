package Codes;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
	
	
	public static void charSeq(String str) {
		String str1 = str.toLowerCase();
		//String str2 = str1.replaceAll(" ", "");
		Map<Character, Integer> charnumber = new HashMap<Character, Integer>();
		char charnumbertoarray[] = str1.toCharArray();
		for (char charsequence : charnumbertoarray) {
			if(!String.valueOf(charsequence).isBlank())
			if(charnumber.containsKey(charsequence)) {
				charnumber.put(charsequence, charnumber.get(charsequence)+1);
			}
			else {
				charnumber.put(charsequence, 1);
			}
		}
		System.out.println(str +  " : " + charnumber);
	}
		
		
		public static void main(String[] args) {
			charSeq("test1233344555555555");
			charSeq("Mayanka Sao");
			charSeq("123 123        ");
		
		}
			
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



//	public static void charCount(String str1) {
//		String str2 = str1.toLowerCase();
//		String str = str2.replaceAll(" ", "");
//		Map<Character, Integer> charcount = new HashMap<Character, Integer>();
//		char count[] = str.toCharArray();
//		for (char array : count) {
//			if (charcount.containsKey(array)) {
//				charcount.put(array, charcount.get(array) + 1);
//
//			} else {
//				charcount.put(array, 1);
//
//			}
//
//		}
//
//		System.out.println(str + " : " + charcount);
//	}
//
//	public static void main(String[] args) {
//		charCount("Mayanka Sao");
//
//	}
//
//}
