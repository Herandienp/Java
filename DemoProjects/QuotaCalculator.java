package chapter3;

import java.util.Scanner;
/*
*
*IF Else
*All sales are expected to make at least 10 sales each week. 
*For those who do, they receive a congratulatory message
*For those who dont, they are informed of how many sales they were short 
*/
public class QuotaCalculator {
	
	public static void main(String[] args) {
		
		//initialize values we know 
		int quota = 10;
		
		// get the unknown values
		System.out.println("Enter the number of sales you made this week:");
		Scanner scanner = new Scanner(System.in);
		int sales = scanner.nextInt();
		scanner.close();
		
		//Make decision on the path to take-output
		if (sales >= quota) {
			System.out.println("Congrats! you have met your quota");
			
		}
		else {
			int salesShort =quota - sales;
			System.out.println("you did not make your quota. you were:"+ salesShort + "Sales Short");
			
		}
			
	}

}
