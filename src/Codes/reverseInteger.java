package Codes;

import java.util.Scanner;

public class reverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int original;
		int reverse = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter integer");
		original = in.nextInt();
		while(original!=0) {
			//while(0<=original) {
			int remainder = original%10;
			reverse = reverse*10+ remainder;
			original = original/10;		

		}
		System.out.println("The reverse of the given number is: " + reverse);  




	}

}
