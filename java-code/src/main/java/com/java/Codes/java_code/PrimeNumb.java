package com.java.Codes.java_code;

import java.util.Scanner;

public class PrimeNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Not a prime numb");
		} else {
			System.out.println("is a prime numb");
		}

		sc.close();
	}

}
