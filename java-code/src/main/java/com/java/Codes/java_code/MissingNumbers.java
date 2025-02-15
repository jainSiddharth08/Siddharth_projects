package com.java.Codes.java_code;

public class MissingNumbers {
	
	public static int findMissingNumber(int[] arr, int n) {
		int expectedSum = n * (n + 1) / 2;
		
		// Calculate the actual sum of elements in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // The missing number is the difference
        return expectedSum - actualSum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,5,2,6};
		int n = 6;
		System.out.println("The missing number is: " + findMissingNumber(arr, n));

	}

}
