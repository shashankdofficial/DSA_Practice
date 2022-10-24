package com.masai;

import java.util.HashMap;
import java.util.Map;

//Given a vector of N positive integers and an integer X. The task is to find the frequency of X in vector.

		/*Example 1:
		
		Input:
		N = 5
		vector = {1, 1, 1, 1, 1}
		X = 1
		Output: 
		5
		Explanation: Frequency of 1 is 5.*/

/*Your Task:
Your task is to complete the function findFrequency() which should count the frequency of X and return it.*/

public class FindFrequency {
	public static int findFrequency(int N, int[] arr, int X) {
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<N; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		int count = 0;
		for(Map.Entry<Integer, Integer> i : map.entrySet()) {
			if(i.getKey() == X) {
				count = i.getValue();
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int N = 5;
		int[] arr = {1,1,1,1,1};
		int X = 1;
		
		System.out.println(findFrequency(N,arr,X));
	}

}
