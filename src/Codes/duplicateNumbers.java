package Codes;

import java.util.Scanner;

public class duplicateNumbers {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		//int numbers= input.nextInt();
		System.out.println("Enter Duplicate Numbers");
		int numbers= input.nextInt();
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,6,7,7,8,8};
		int arraylength = arr.length;
		for (int i = 0;i<arraylength; i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j])
					System.out.println("Duplicate numbers in array are : " +arr[j]);

			}

		}

	}

}
