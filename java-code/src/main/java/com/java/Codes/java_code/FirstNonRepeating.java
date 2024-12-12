package com.java.Codes.java_code;

import java.util.Scanner;

public class FirstNonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		String str = sc.nextLine();
		
		int[] freq = new int[26];
		
		for (char c : str.toCharArray()) {
			freq[c - 'a']++;
		}
		
		for (char c : str.toCharArray()) {
			if (freq[c - 'a'] == 1) {
				System.out.println(c);
			}
		}
		
		

	}

}
