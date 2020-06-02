package Methods;

public class Sample6 {
	// program4: calling non static method from diff class

	public static void main(String[] args) {

		System.out.println("Main Method Started");

		Sample7 s1 = new Sample7(); // object creation
		s1.M6();
		s1.M7();

		System.out.println("Main Method Ended");

	}
}
