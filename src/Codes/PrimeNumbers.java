package Codes;

public class PrimeNumbers {

	public static boolean isPrimeNumber(int num) {
		if (num <= 1) {
			return false;

		}
		for (int i = 2; i <= num; i++) {
			if (num % 2 == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		System.out.println("5 is prime number ? " + isPrimeNumber(5));
		System.out.println("4 is prime number ? " + isPrimeNumber(4));
		System.out.println("0 is prime number ? " + isPrimeNumber(0));
		System.out.println("-4 is prime number ? " + isPrimeNumber(-4));
		System.out.println("98 is prime number ? " + isPrimeNumber(98));
		System.out.println("19182 is prime number ? " + isPrimeNumber(19182));
		System.out.println("6 is prime number ? " + isPrimeNumber(6));

	}
}
