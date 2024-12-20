package com.java.Codes.java_code;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class PatternMismatchInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String str = "SPSSOSTTSSOSSOSQOSSOSROS";
		String pattern = "SOS";
		int len = pattern.length();
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char c = pattern.charAt(i % len);			
			if(c != str.charAt(i)) {
				count++;
				System.out.println(str.charAt(i));				
			}
			
		}
		System.out.println(count);

	}

}
