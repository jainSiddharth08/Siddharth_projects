package com.java.Codes.java_code;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*To reverse a string without reversing the position of words*/
		
		String s = "Hi this is DeepIntent";
		
		String[] words = s.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			String reversed = "";
		    for (int j = words[i].length() - 1; j >= 0; j--) {
		        reversed += words[i].charAt(j); // Add characters in reverse order
		    }		
			
			words[i] = reversed;
		}
		String result = String.join(" ", words);
		System.out.println(result);

	}

}
