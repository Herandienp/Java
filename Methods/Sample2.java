package Methods;

public class Sample2 {

	// Program2: Static Method Call From diff Class

	public static void main(String[] args) {

		System.out.println("main method started");

		sample3.m1();
		Sample4.m2();
		
		System.out.println("main method ended");
	}

}
