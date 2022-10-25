package com.masai;

public class BinarySearchIterative {

	public static void main(String[] args) {
		int[] arr = {0,20,30,40,50,60,70,80,90,100};
		int data = 70;
		int l = 0;
		int h = arr.length-1;
		
		while(l <= h) {
			int mid = (l + h) / 2;
			if(data > arr[mid]) {
				l = mid+1;
			}
			else if(data < arr[mid]) {
				h = mid-1;
			}
			else {
				System.out.println(mid);
				return;
			}
		}
		System.out.println(-1);
	}

}
