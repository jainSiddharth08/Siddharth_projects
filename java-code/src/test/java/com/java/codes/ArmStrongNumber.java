package com.java.codes;

import java.util.Scanner;

;

public class ArmStrongNumber {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int original = number;
	        int result = 0;
	        int n = String.valueOf(number).length();

	        while (number != 0) {
	            int digit = number % 10;
	            result += Math.pow(digit, n);
	            number /= 10;
	        }

	        if (result == original) {
	            System.out.println(original + " is an Armstrong number.");
	        } else {
	            System.out.println(original + " is not an Armstrong number.");
	        }
	    }

}
