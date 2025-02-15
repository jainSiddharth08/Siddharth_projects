package com.collections.java;

import java.util.Stack;

public class StackExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> cars = new Stack<>();
		
		cars.push("Audi");
		cars.push("BMW");
		cars.push("Chevrolet");
		cars.push("Dodge");
		
		System.out.println("Stack: " + cars);
		System.out.println("Stack: " + cars.peek());
		
		cars.pop();
		System.out.println(cars);
		System.out.println("Stack: " + cars.peek());
	}

}
