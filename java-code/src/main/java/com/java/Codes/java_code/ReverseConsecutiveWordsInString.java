package com.java.Codes.java_code;

public class ReverseConsecutiveWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hi Mahesh I am Siddharth from Nagpur";
		String[] words = s.split(" ");
		for (int i = 0; i < words.length; i++) {
			String rev = "";
			if (i % 2 == 0) {
				for (int j = words[i].length() - 1; j >= 0; j--) {
					rev = rev + words[i].charAt(j);
				}
				words[i] = rev;
			}
		}
		String output = String.join(" ", words);
		System.out.print(output);
	}
}
