package com.java.Codes.java_code;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {3, 8, 5, 12, 9, 4, 7, 6};

	        // Step 1: Separate even and odd numbers into different lists
	        ArrayList<Integer> evens = new ArrayList<>();
	        ArrayList<Integer> odds = new ArrayList<>();

	        for (int num : arr) {
	            if (num % 2 == 0) {
	                evens.add(num);
	            } else {
	                odds.add(num);
	            }
	        }

	        // Step 2: Sort both lists
	        Collections.sort(evens);
	        Collections.sort(odds);

	        // Step 3: Merge both lists back into the array
	        int index = 0;
	        for (int even : evens) {
	            arr[index++] = even;
	        }
	        for (int odd : odds) {
	            arr[index++] = odd;
	        }

	        // Print the sorted array
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
		
	}

}
