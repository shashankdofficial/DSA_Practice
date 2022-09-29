package questions;

//Given n non-negative integers representing an elevation 
//map where the width of each bar is 1, compute how much water it can trap after raining.

//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
//Output: 6
//Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
//Example 2:
//
//Input: height = [4,2,0,3,2,5]
//Output: 9
// 
//
//Constraints:
//
//n == height.length
//1 <= n <= 2 * 104
//0 <= height[i] <= 105

public class TrappingrainWater_42 {
	public static int trapping(int N, int[] arr) {
		int left = 0;
        int right = N - 1;
        
        int leftB = arr[0];
        int rightB = arr[N - 1];
        
        int sum = 0;
        
        while(left <= right){
            
            if(leftB < rightB){
                if(arr[left] > leftB){
                    leftB = arr[left];
                }
                else{
                    sum += leftB - arr[left];
                    left++;
                }
            }
            else{
                 if(arr[right] > rightB){
                    rightB = arr[right];
                }
                else{
                    sum += rightB - arr[right];
                    right--;
                }
            }
            
        }
        return sum;
	}

	public static void main(String[] args) {
		int[] arr = {4,2,0,3,2,5};
		int N = 6;
		
		System.out.println(trapping(N,arr));
	}

}
