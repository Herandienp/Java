package Polymorsphim;

public class MethodOverloading {

	public void m1() {
		System.out.println("non static method1");
	}

	public void m1(int a) {
		System.out.println(a);
		System.out.println("non Static Method2");
	}

	public void m1(String str) {
		System.out.println(str);
		System.out.println("non Static Method2");
	}

	public void m1(int a, int b) {
		System.out.println(a);
		System.out.println(b);
		System.out.println("non Static Method2");
	}
}
