package com.java.Codes.java_code;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Race";
		String str2 = "Fare";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if (str1.length() == str2.length()) {
			char[] c1 = str1.toCharArray();
			char[] c2 = str2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			boolean result = Arrays.equals(c1, c2);
			
			if(result) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not an anagram");
			}
		}
	}

}
