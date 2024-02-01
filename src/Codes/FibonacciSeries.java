package Codes;

public class FibonacciSeries {
	
	public static void  fibonacciConcept(int num){
		int a = 0;
		int b = 1;
	 
		for (int i = 1; i <=num ; i++) {
			int c = a+ b;
			System.out.println("Fibonacci Series for integer "+ num +" is : "+c);
			a=b;
			b=c;
		}
	}
	

	public static void main(String[] args) {
		fibonacciConcept(10);
		fibonacciConcept(20);
		
		
	}
//		int a = 0;
//		int b = 1;
//		int c = a + b;
//
//		for (int i = 1; i <= 10; i++) {
//			c = a + b;
//			System.out.println("Sum of A and B are : " + c);
//			a = b;
//			b = c;
//			System.out.println("Value of A is : "+ a);
//			System.out.println("Value of B is : "+ b);
//
//		}

	}
