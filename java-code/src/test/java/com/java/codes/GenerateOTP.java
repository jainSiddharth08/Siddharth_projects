package com.java.codes;

public class GenerateOTP {

	public static void main(String[] args) {

		String otp="";
		for(int i=0;i<4;i++) {
			otp=otp+(int)Math.floor(Math.random()*10);
		}
		System.out.println(otp);
	}
}
