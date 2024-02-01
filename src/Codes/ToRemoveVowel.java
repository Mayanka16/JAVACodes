package Codes;

public class ToRemoveVowel {
	public static void main(String[] args) {

		String s = "MAYANKA";
		char result1;
		char notVowel;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
					|| ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {

				result1 = ch[i];
				
				//System.out.println(result1);
				
			}
			

			else {
				notVowel = ch[i];
				 System.out.println(notVowel);

			}

		}
	}
}

	

