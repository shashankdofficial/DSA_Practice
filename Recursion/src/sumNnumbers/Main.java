package sumNnumbers;

public class Main {
	
	public static void calcSum(int i,int n,int sum) {
		if(i == n) {
			sum += i;
			System.out.println(sum);
			return;
		}
		sum += i;
		calcSum(i+1, n, sum);
	}

	public static void main(String[] args) {
		int n = 5;
		calcSum(1, n, 0);
	}

}
