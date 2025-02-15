package com.java.Codes.java_code;

public class Permutation {
	public static void main(String[] args) {
		String str = "ABC";
		String perm = "";

		if (str.isEmpty()) {
			System.out.println(perm);
		} else {
			for (int i = 0; i < str.length(); i++) {
				char currentChar = str.charAt(i); //A
				String remainStr = str.substring(0, i) + str.substring(i + 1); //BC
				
				for (int j = 0; j < remainStr.length(); j++) {
					char nextChar = remainStr.charAt(j); //B,C
					String lastChar = remainStr.substring(0, j) + remainStr.substring(j + 1); //C
					System.out.println(currentChar + "" + nextChar + lastChar);
				}
			}
		}

	}
}
