package interfac;

public interface B extends A {
	default void run() {
		System.out.println("Hello");
	}

}
