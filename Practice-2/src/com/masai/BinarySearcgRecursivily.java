package com.masai;

public class BinarySearcgRecursivily {
	public static void findRecusively(int[] arr, int start, int end, int search) {
		if(start > end) {
			return;
		}
		int mid = (start + end) / 2;
		if(arr[mid] == search) {
			System.out.println(mid);
			return;
		}
		else if(search > arr[mid]) {
			findRecusively(arr, mid+1, end, search);
		}
		else {
			findRecusively(arr, start, mid-1, search);
		}
	}
	public static void main(String[] args) {
		int[] arr = {10,11,12,13,14,15,16};
		int start = 0;
		int end = arr.length-1;
		int search = 14;
		
		findRecusively(arr, start, end, search);
	}

}
