package com.java.Codes.java_code;

public class ReverseTheOrderOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The sky is blue";
		
		String[] words = str.split(" ");
		String rev = "";
		
		for (int i = words.length - 1; i >=0 ; i--) {
			rev += words[i];
			if (i != 0) {
				rev += " ";
			}
		}
		
		System.out.println(rev);

	}

}
