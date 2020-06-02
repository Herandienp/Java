package chapter3;

import java.util.Scanner;

/*
 * 
 * Nested IF's
 * To qualify for a loan a person must make at least $30 000
 * and have been working at their current job for at least 2 years
 */

public class LoanQualifier {

	public static void main(String[] args) {
		
		//Initialize what we know
		int requiredSalary = 30000;
		int requiredYearsEmployed =2;
		
		// Get what we do not know 
		System.out.println("Enter your Salary");
		Scanner scanner =new Scanner(System.in);
		double salary = scanner.nextDouble();
		
		
		System.out.println("Enter the number of Years with your current Employer:");
		double years = scanner.nextDouble();
		scanner.close();
		
		//Make Decision / output
		if (salary>= requiredSalary){
			if(years>= requiredYearsEmployed){
				System.out.println("Congrats! you Qualify for the loan");
			}
			else {
				
				System.out.println("Sorry you must have worked on your current job"
			+ requiredYearsEmployed + "years.");
			}
		}
		else {
			
		System.out.println("Sorry , you must earn atleast $"+ requiredSalary + "to qualify for the loan");
		}
}
}