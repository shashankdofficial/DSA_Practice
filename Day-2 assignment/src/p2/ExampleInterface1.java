package p2;

public interface ExampleInterface1 {
	void method1();

	default void method5() {
			System.out .println("Method5");
	}
}