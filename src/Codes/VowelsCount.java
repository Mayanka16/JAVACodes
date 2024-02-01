package Codes;

import java.util.function.IntPredicate;
//import com.google.common.base.CharMatcher;

public class VowelsCount {
	
	
	//java

	public static boolean isVowel(char t) {
		return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' || t == 'A' || t == 'E' || t == 'I' || t == 'O'
				|| t == 'U';

		
	}

	public static void main(String[] args) {
		String str = "testing";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(isVowel(str.charAt(i)))
					count++;
					}
		System.out.println(count);
		
		
		
		//java 8 streams
		System.out.println("Using Java 8 Streams");
		IntPredicate vowel = new IntPredicate() {
			
			@Override
			public boolean test(int t) {
				return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' || t == 'A' || t == 'E' || t == 'I' || t == 'O'
						|| t == 'U';

			}
		};
		
		String test = "Naveen Automation Labs";
		long vCount= test.chars().filter(vowel).count();
		System.out.println(vCount);
		


	
	// using google guava lib
	String st = "java examples";
//int vCount1 = CharMatcher.anyOf("aeios").countIn(st);
	
	//System.out.println(vCount1);

	}
}
	
	

