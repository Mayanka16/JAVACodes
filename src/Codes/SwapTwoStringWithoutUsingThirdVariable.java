package Codes;

public class SwapTwoStringWithoutUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
		String b = "World";

		System.out.println("Before Swapping value of String a is "+a+" and value of String b is "+b);
		a = a+b;

		//System.out.println("Value of A = " +a);

		b = a.substring(0,a.length()-b.length() );

		System.out.println("Value of B after Swap = " + b);

		a = a.substring(b.length());
		System.out.println("Value of A after Swap = " + a);
	}

}
