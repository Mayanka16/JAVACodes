package Codes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {
	// 1. using hashmap concept 
	
	
	public static void findDupicateWords(String inputString) {

		// split
		String words[] = inputString.split(" ");

		// hashmap
		Map<String, Integer> wordCount = new HashMap<String, Integer>();

		// to check each word in given array
		for (String word : words) {
			if (wordCount.containsKey(word)) {
				wordCount.put(word.toLowerCase(), wordCount.get(word) + 1);
			} else {
				wordCount.put(word, 1);
			}

		}
		// extracting all the keys of maps - wordCount

		Set<String> wordsInString = wordCount.keySet();

		// loop through all the words in wordcount
		for (String word : wordsInString) {
			if (wordCount.get(word) > 1) {
				System.out.println(word + " : " + wordCount.get(word));
			}

		}

	}

	public static void main(String[] args) {
	findDupicateWords("Hey java is the best language is java");
//	findDupicateWords("Hi");
//	findDupicateWords("2345677888");
//	findDupicateWords("m u M U");
//	

	}
	
	

	//2. using for loop
	
	
	
//	  public static String findingMatchingWords(String str)
//	    {
//
//		  int count =0;
//	        String Result = "";
//	        String strArray[] = str.split(" ");
//	        for (int i = 0; i < strArray.length; i++) {
//	            count = 1;
//	            for (int j = i + 1; j < strArray.length; j++) {
//	                if (strArray[i].equals(strArray[j])) {
//	                    count++;
//	                    strArray[j] = "0";
//
//	                }
//	            }
//	            if (count> 1 && strArray[i] != "0"){
//	                Result = strArray[i];
//	                System.out.println(Result+"----"+count);
//	            }
//	        }
//	        return Result;
//	    }
//	    public static void main(String[] args) {
//	    // call the function
//
//	       findingMatchingWords("Hey java is the best language is java");
//	        findingMatchingWords("Hi");
//	        findingMatchingWords("2345677888");
//	        findingMatchingWords("m u M U");
	}

