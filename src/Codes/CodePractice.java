package Codes;

import java.util.Scanner;

public class CodePractice {

	public static void main(String args[]) {

		String original;
		String reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter");
		
		original = in.nextLine();
		int length = original.length();
		for (int i=length-1; i>= 0 ; i--) {
			reverse = reverse + original.charAt(i); }
			if(original.equals(reverse)) {
				System.out.println("It is a palindrome");
			}
			else {
				System.out.println("Not a palindrome");
			}

		}

	}

