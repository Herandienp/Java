package Methods;

public class Sample5 {

	// program3: calling non static Method from same class

	public static void main(String[] args) {

		System.out.println("Main Method Started");

//create object of class
		// classname variableName// Object Name = new className();
		Sample5 s = new Sample5();
		//int a= 10;
		s.M6();
		s.M7();

		System.out.println("Main Method Ended");
	}

	public void M6() {

		System.out.println("Running Non Static Method");
	}

	public void M7() {

		System.out.println("Running Non Static Method");
	}

}
