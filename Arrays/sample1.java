package Arrays;

import java.util.Arrays;

public class sample1 {
	
	public static void main(String[] args) {
		
		String [] ar = new String[5];
		
		ar[0] ="Peter";
		ar[1] = "Jade";
		ar[2] ="Sanjay";
		ar[3] ="adem";
		ar[4] = "Jondre";
		
		
		System.out.println("----- Orginial Information--------------");
		
		for(int i=0 ; i<= ar.length-1;i++) {
			System.out.println(ar[i]);
			
		}
		
		Arrays.sort(ar);
		
		System.out.println("-----Print information in Accending order----");
		
		for(int i =0 ;i<=ar.length-1; i++)
		System.out.println(ar[i]);
		
		System.out.println("-------Print information in Deccending order---");
		for(int i= ar.length-1; i>=0;i--)
		System.out.println(ar[i]);
		
	}

}
