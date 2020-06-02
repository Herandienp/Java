package chapter3;

import java.util.Scanner;

/*
 * If Statement 
 * All sales personal gets a payment of $1000
 * Sales People who exceed 10 sales get additional bonuses of $250 
 */
public class SalaryCalculator {

	public static void main(String[] args) {
		
		//Initialize known values
		int salary = 1000;
		int bonus =250;
		int quota = 10;
		
		//Get Values for the unkown
		System.out.println("How many sales did the employee make this week?");
		Scanner scanner = new Scanner(System.in);
		int sales = scanner.nextInt();
		scanner.close();
		
		// Quick Detour for the bonus earners
		if (sales >quota){
			
			salary = salary + bonus;
		}
		// Output
		
		System.out.println("The Employees pay is $"+ salary);
		
		
	}
	
	
	
}
