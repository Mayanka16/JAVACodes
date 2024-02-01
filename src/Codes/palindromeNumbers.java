package Codes;

import java.util.Scanner;

public class palindromeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*A palindrome number is a number that is same after reverse. For example 545, 151, 34543, 343, 171, 48984 are the 
		 palindrome numbers. It can also be a string like LOL, MADAM etc.
		 
		 
Get the number to check for palindrome
Hold the number in temporary variable
Reverse the number
Compare the temporary number with reversed number
If both numbers are same, print "palindrome number"
Else print "not palindrome number"

*/
		
		// Option 1
		
		
//		int sum = 0;
//		int a = 545;
//		int b = a;
//		int r;
//		while(a>0) {
//			r = a%10;
//			sum = (sum*10)+r;
//			a=a/10;
//		}
//		if(b==sum) 
//			System.out.println("palindrome number ");    
//			  else    
//			   System.out.println("not palindrome");    
//			
//		}
//		
		
		
		//Option 2
		{
			String original, reverse = "";
			Scanner in = new Scanner(System.in);
			System.out.println("Enter a string or number to check if it a palindrome");
			original = in.nextLine();
			int length = original.length();
			for (int i= length-1;i>=0;i--) {
				reverse = reverse + original.charAt(i);}
				if(original.equals(reverse))
					 System.out.println("Entered string/number is a palindrome.");  
			      else  
			         System.out.println("Entered string/number isn't a palindrome.");  
			
			
		}
	
	}
}


