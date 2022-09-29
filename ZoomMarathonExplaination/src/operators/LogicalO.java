package operators;

public class LogicalO {

	public static void main(String[] args) {
		int a = 20, b = 30;

		if(a < 50 && b < 20) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		// Single | and & is Bitwise operators
		if(a < 50 & b < 20) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
