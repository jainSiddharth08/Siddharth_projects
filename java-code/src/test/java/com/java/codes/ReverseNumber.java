package com.java.codes;

public class ReverseNumber {

	public static void main(String[] args) {
		int a = 462;
		int rev = 0;
		while (a > 0) {
			int rem = a % 10; // 2
			rev = rev * 10 + rem;// 0*10+2
			a = a / 10;
		}
		System.out.print(rev);

	}

}
