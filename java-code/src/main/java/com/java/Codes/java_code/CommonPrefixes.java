package com.java.Codes.java_code;

public class CommonPrefixes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "flow", "flower", "flight" };

		String prefix = words[0];

		for (int i = 1; i < words.length; i++) {
			while (words[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
			}
		}
		System.out.println(prefix);
	}

}
