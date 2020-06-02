package Collection;

import java.util.ArrayList;

public class sample1 {

	public static void main(String[] args) {
	
		  ArrayList al = new ArrayList();
		  al.add(10);
		  al.add("abcd");
		  al.add("xyz");
		  al.add(10);
		  al.add('c');
		  al.add(null);
		  al.add(null);
		  
		  System.out.println(al.get(4));
		  System.out.println(al.size());
		  System.out.println(al.isEmpty());
		  al.set(4, 'a');
		  System.out.println(al.get(4));
		  al.remove(6);
		  System.out.println(al.size());
		
	}
}
