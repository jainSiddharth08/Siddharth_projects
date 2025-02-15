package com.java.Codes.java_code;

import java.util.HashSet;

public class LongestSubstringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ababbcabaadbc";
		int startPtr = 0, maxLen = 0;
		HashSet<Character> set = new HashSet<>();
		
		for (int endPtr = 0; endPtr < str.length(); endPtr++) {
			while (set.contains(str.charAt(endPtr))) {
				set.remove(str.charAt(startPtr));
				startPtr++;
			}
			set.add(str.charAt(endPtr));
			maxLen = Math.max(maxLen, endPtr - startPtr + 1);
		}
		System.out.println(set);
		System.out.println("Len of longest substring " + set.toString() + " in " + str + ": " + maxLen);
		

	}

}
