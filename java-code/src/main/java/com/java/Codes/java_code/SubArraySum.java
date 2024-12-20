package com.java.Codes.java_code;

public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 2, 1, 6, 4};
		int target = 5;
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int currSum = 0;
			for (int j = i; j < arr.length; j++) {
				currSum += arr[j];
				if (currSum == target) {
					count++;
				}
			}
			System.out.print(count); 
		}
		
	}

}
