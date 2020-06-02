package This_Supper_Keyword;

public class demo2 extends demo1
{
	int a = 20;

	public void test() {
		int a = 30;
		System.out.println(a);       //30
		System.out.println(this.a);  //20 // access global variable from the same class
		System.out.println(super.a); //10 access global variable from supper class into Subclass
	}

}
