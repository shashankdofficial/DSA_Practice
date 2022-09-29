package curtshot;

public class Test {

	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		
		StringBuffer s3 = new StringBuffer("Value1");
		String s2 = "Value2";

		for (int i = 0; i < 100000; ++i) {
			s3.append(s2);
		}
		
		final long endTime = System.currentTimeMillis();

		System.out.println("Total execution time: " + (endTime - startTime));
	}

}
