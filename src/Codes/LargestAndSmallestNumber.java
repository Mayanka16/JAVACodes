package Codes;

import java.util.Arrays;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {-98,78,3524,0,3356337};
		int largest = arr[0];
		int smallest = arr[0];

		for(int i = 1; i<arr.length;i++) {		
			if(arr[i]>largest) {
				largest =arr[i];
			}
			else if(arr[i]<smallest){
				smallest=arr[i];


			}
		}
		System.out.println("Given string of array is "+ Arrays.toString(arr));

		System.out.println("Largest Number : "+largest);	
		System.out.println("Smallest Number "+smallest);
	}

}


