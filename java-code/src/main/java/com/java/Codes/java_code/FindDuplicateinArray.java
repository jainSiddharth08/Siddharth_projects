package com.java.Codes.java_code;

import java.util.HashSet;

public class FindDuplicateinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 1, 4, 2, 5};
		
		HashSet<Integer> set = new HashSet<>();
		
		for (int num : arr) {
			if (!set.add(num)) {
				System.out.println(num);
			}
		}
	}

}
