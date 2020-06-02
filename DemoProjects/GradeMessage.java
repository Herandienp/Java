package chapter3;

import java.util.Scanner;

public class GradeMessage {
	
public static void main(String[] args) {
	
	System.out.println("Please Enter the letter Grade:");
	Scanner scanner = new Scanner(System.in);
	String grade = scanner.next();
	
	String message;
	// in Switch Condition is equality
	
	switch(grade){
		case "A":
			message = "Excellent Job!";
			break;
		case "B":
			message = "Great Job!";
			break;
		case "C":
			message = "Good Job";
			break;
		case "D":
			message = "You need to work a bit harder";
			break;
		case "F":
			message = "uh oh!";
			break;
			default: 
				message ="Error. Invalid Grade";
				break; 
	}
	System.out.println(message);
}

}
