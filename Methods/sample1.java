package Methods;

public class sample1 {

	// Program1: Static Method Call From Same Class

	public static void main(String[] args) {

		System.out.println("main method started");

		m1();

		System.out.println("Main Method ended");
	}

	// static method
	public static void m1() {
		System.out.println("running static method");
	}

}
