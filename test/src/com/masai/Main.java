package com.masai;

import java.util.*;

public class Main{
	
	public static void main(String[] args) {
		
		int[] arr = {3,2,3,4,3,5,2};
		
//		Set<Integer> set = new HashSet<>();
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> i : map.entrySet()) {
			if(i.getValue() > 1) {
				System.out.println(i.getKey());
			}
		}
	}
}
