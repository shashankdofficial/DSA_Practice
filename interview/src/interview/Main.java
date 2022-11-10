package interview;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		int[] arr = { 100,34, 49, 47, 94, 94, 52, 86, 36, 84, 89 };
		
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
				even.add(arr[i]);
			}
			else {
				odd.add(arr[i]);
			}
		}
		System.out.println("Even");
		for(int i=0; i<even.size(); i++) {
			System.out.print(even.get(i)+" ");
		}
		System.out.println();
		System.out.println("Odd");
		for(int i=0; i<odd.size(); i++) {
			System.out.print(odd.get(i)+" ");
		}
//		Object[] arr2 = even.toArray();
		Collections.sort(even);
		
		int count=0,max=-1;
		for(int i=even.size()-1; i>=0; i--) {
			if(count == 2) {
				System.out.println(even.get(i));
				break;
			}
			else if(even.get(i) > max ) {
				max = even.get(i);
				count++;
			}
		}
	}

}









