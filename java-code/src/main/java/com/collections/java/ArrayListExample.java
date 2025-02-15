package com.collections.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * If size of ArrayList is 10 and we added 1 more value then the new size will
		 * be n + n/2 + 1 (in this case it will be 16)
		 */
		
		List<String> studentName = new ArrayList<>();
		studentName.add("Siddharth");
		studentName.add("Aviral");
		studentName.add("Anubhuti");
		
		System.out.println(studentName);
		studentName.add("Audi");
		
		studentName.add(1, "BMW");
		System.out.println(studentName);
		
		for(String student : studentName) {
			System.out.println(student);
		}
		
		//Add this Integer list to the String List
		List<Integer> numb = new ArrayList<>();
		numb.add(2);
		numb.add(5);
		numb.add(16);
		
		String numbAsString = numb.toString();
		
		//[Siddharth, BMW, Aviral, Anubhuti, Audi, [2, 5, 16]]			
		//studentName.add(numbAsString);		
		System.out.println(studentName);
		
		
		//[Siddharth, BMW, Aviral, Anubhuti, Audi, 2, 5, 16]
		for(Integer num : numb) {
			studentName.add(num.toString());
		}
		System.out.println(studentName);
		
		
		System.out.println(studentName.get(4));
		
		System.out.println(studentName.remove(1));
		System.out.println(studentName);
		System.out.println(studentName.remove(String.valueOf("Aviral")));
		System.out.println(studentName);
		
		studentName.set(2, "Aviral");
		System.out.println(studentName);
		
		System.out.println(studentName.contains(20));
		
		//Iterate through list
		
		//Method1:		
		for (int i = 0; i < studentName.size(); i++) {
			System.out.println("Elements are: " + studentName.get(i));
		}
		
		//Method2:
		for(String student : studentName) {
			System.out.println("For each element: " + student);
		}
		
		//Method3:
		Iterator<String> it = studentName.iterator();		
		while(it.hasNext()) {
			System.out.println("iterator " + it.next());
		}
		
	}

}
