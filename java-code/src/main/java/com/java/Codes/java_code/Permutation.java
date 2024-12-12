package com.java.Codes.java_code;

public class Permutation {
 public static void main(String[] args) {
	String str = "ABC";
	
	for (int i = 0; i < str.length(); i++) {
		char currentChar = str.charAt(i);
		String newStr = str.substring(0, i) + str.substring(i + 1);
	}
}
}
