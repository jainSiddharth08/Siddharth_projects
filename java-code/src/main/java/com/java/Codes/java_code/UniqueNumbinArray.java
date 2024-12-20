package com.java.Codes.java_code;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		 // Example input array
        int[] array = {11, 6, 13, 11, 12, 13, 11};

        // Sets to track unique and duplicate elements
        Set<Integer> uniques = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        // Process each number in the array
        for (int num : array) {
            if (duplicates.contains(num)) {
                // Already a duplicate, skip
                continue;
            } else if (uniques.contains(num)) {
                // Move to duplicates set
            	uniques.remove(num);
            	duplicates.add(num);
            } else {
                // Add to unique set
            	uniques.add(num);
            }
        }

        // Print numbers that appear exactly once
        for (int unique : uniques) {
            System.out.println(unique);
        }
    }

}
