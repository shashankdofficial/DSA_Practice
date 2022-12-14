package printFactorial;

public class Main {
	
	public static int calcFactorial(int n) {
		if(n == 1 || n == 0) {
			return 1;
		}
		int f_nm1 = calcFactorial(n-1);
		int f_n = n * f_nm1;
		return f_n;
	}

	public static void main(String[] args) {
		int n = 5;
		int ans = calcFactorial(n);
		System.out.println(ans);
	}

}
