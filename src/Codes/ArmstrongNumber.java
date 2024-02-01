package Codes;

public class ArmstrongNumber {
	
	//It's a number that equals the sum of its digits, each raised to a power. For example, 
	//if you have a number like 153, it's an Armstrong number because 1^3 + 5^3 + 3^3 equals 153.
	
	public static void armstrong(int num) {
		System.out.println("Given Number is "+ num);
		int cube = 0, r, temp;
		temp = num;
		while(num>0) {
			r=num%10;
			num = num/10;
			cube = cube+(r*r*r);
			
		}
		if (temp==cube) {
			System.out.println("This is an Armstrong Number");
		}
		else {
			System.out.println("This is not an Armstrong Number");
		}
	}

	public static void main(String[] args) {
	
	armstrong(153);
	armstrong(-153);
	armstrong(1532433);
	armstrong(1); // armstrong
	armstrong(121212); 
	armstrong(0); // this is an armstrong number as temp==cube will satisfy for 0

	
	}

}
