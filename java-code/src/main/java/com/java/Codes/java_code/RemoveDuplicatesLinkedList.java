package com.java.Codes.java_code;

import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDuplicatesLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(30);
		list.add(60);
		list.add(42);
		list.add(22);
		list.add(31);
		list.add(30);
		list.add(22);
		
		System.out.println("Original List: " + list);
		
		HashSet<Integer> set = new HashSet<>();
		
		for (int num : list) {
			if (!set.add(num)) {
				set.remove(num);
			}
		}
		
		System.out.println("List after removing duplicates: " + set);


	}

}
