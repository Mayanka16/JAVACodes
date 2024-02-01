package Codes;

public class FactorialNumber {

	// fact of 4 = 4*3*2*1
	// fact of 10 = 10*9*8*7*6*5*4*3*2*1
	// fact of 1 = 1
	// fact of 0 = 1

	// 1. without recursive - by using loop

	public static int fact(int num) {
		System.out.println("Factorial of " + num + " is ");
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;

		}
		return fact;
	}
	// 2. recursive - a function is calling itself

	public static int factorial(int num) {

		if (num == 0)

			return 1;

		else
			// System.out.println("By using recursive method " + num);
			return (num * factorial(num - 1));

	}

	public static void main(String[] args) {

		System.out.println(fact(4));
		System.out.println(fact(1));
		System.out.println(fact(0));
		System.out.println(fact(5));

		System.out.println(factorial(10));
		System.out.println(factorial(11));
		System.out.println(factorial(12));
		System.out.println(factorial(3));
	}

}
