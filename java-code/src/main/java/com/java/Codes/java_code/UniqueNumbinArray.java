package com.java.Codes.java_code;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * // Read the size of the array int n = scanner.nextInt();
		 * 
		 * // Use a HashMap to count occurrences of each number HashMap<Integer,
		 * Integer> frequencyMap = new HashMap<>();
		 * 
		 * // Read array elements and update the frequency map for (int i = 0; i < n;
		 * i++) { int num = scanner.nextInt(); frequencyMap.put(num,
		 * frequencyMap.getOrDefault(num, 0) + 1); }
		 * 
		 * // Print numbers that appear exactly once for (Map.Entry<Integer, Integer>
		 * entry : frequencyMap.entrySet()) { if (entry.getValue() == 1) {
		 * System.out.println(entry.getKey()); } }
		 * 
		 * scanner.close(); }
		 */
	
	/*****************************Without using scanner***********************/
	/*
	 * public static void main(String[] args) { // Example input array int[] array =
	 * {4, 5, 6, 4, 7, 5, 8, 6, 9};
	 * 
	 * // Use a HashMap to count occurrences of each number HashMap<Integer,
	 * Integer> frequencyMap = new HashMap<>();
	 * 
	 * // Update the frequency map with array elements for (int num : array) {
	 * frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1); }
	 * 
	 * // Print numbers that appear exactly once for (Map.Entry<Integer, Integer>
	 * entry : frequencyMap.entrySet()) { if (entry.getValue() == 1) {
	 * System.out.println(entry.getKey()); } } }
	 */
	
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
