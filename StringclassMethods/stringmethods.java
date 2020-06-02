package StringclassMethods;

public class stringmethods {

	public static void main(String[] args) {

		String s1 = "Abcd";
		String s2 = "abcd";
		String s3="abc";
		System.out.println(s1);
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.length()); //character length
		System.out.println(s1.equals(s2));//comparison of two strings
		System.out.println(s1.equalsIgnoreCase(s2)); //comparison string with ignore case
		
		System.out.println(s2.contains(s3));//verification of one string in another string
		
		
	}

}
