package com.java.Codes.java_code;

public class ReverseWoBuiltIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Siddharth Jain";
		String rev = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		
		System.out.println(rev);

	}

}
