package com.masai;

import java.util.LinkedList;

public class LLwithCollection {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.addFirst("a");
		list.addFirst("is");
		
		System.out.println(list);
		
		list.addFirst("This");
		list.addLast("List");
		
		System.out.println(list);
		
		System.out.println(list.size());
	}

}
