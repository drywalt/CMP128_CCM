package week7;

import java.util.Scanner;

public class TotalExpenses {

	public static void main(String[] args) {
		double amount = 0, total = 0;
		int numOfDays = 0;  //used for the number of days to track
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many days would you like to track?");
		numOfDays = scanner.nextInt();
		
		for (int day = 1; day <= numOfDays; day++){
			System.out.println("How much did you spend on day "+ day + "? ");
			do {
				amount = scanner.nextDouble();
				if (amount < 0){
					System.out.println("The amount must be 0 or greater");
				}
			} while(amount < 0);
			
			total += amount;  //accumulate the total
			System.out.println("The current total is "+ total);
		}
		System.out.println("The total for " + numOfDays+ " days is " + total);

	}

}




