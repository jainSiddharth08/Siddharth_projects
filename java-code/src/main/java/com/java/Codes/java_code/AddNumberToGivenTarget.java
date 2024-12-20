package com.java.Codes.java_code;

import java.util.HashMap;

public class AddNumberToGivenTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numb = {2, 8, 7, 10, 1};
		int target = 9;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < numb.length; i++) {
			int diff = target - numb[i];
			if(map.containsKey(diff)) {
				System.out.println("[" + map.get(diff) + ", " + i + "]");
				return;
			}
			map.put(numb[i], i); //{2: 0} 
		}
		
	}

}
