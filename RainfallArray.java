package week11;
import java.util.Scanner;
public class RainfallArray {

	public static void main(String[] args) {
		//declare an array of 12 Strings for the months
		String [] monthArray = {"January", "February", "March", 
								"April", "May", "June", "July",
								"August", "September", "October",
								"November", "December"};
		//declare 2 Strings for the highest and lowest months
		String highestMonth ="", lowestMonth ="";
		//declare an array of 12 doubles
		double [] rainfall = new double[12];
		//declare a double for: total, highest, lowest
		double total = 0, highest = 0, lowest = 0;
		//declare a Scanner for System.in
		Scanner scanner = new Scanner(System.in);
		
		//use for loop to prompt for the amount of rain for a month
		//store in the array
		for (int month = 0; month < rainfall.length; month++){
			System.out.print("Enter the amount of rain for " + monthArray[month] + " ");
			rainfall[month]	= scanner.nextDouble();
		}
		
		//use for loop to accumulate the total and determine the
		//highest and lowest rainfall amounts
		for(int month = 0; month < rainfall.length; month++){
			total += rainfall[month];
			if (month == 0){
				highest = rainfall[month];
				highestMonth = monthArray[month];
				lowest = rainfall[month];
				lowestMonth = monthArray[month];
			}
			if (rainfall[month] > highest){
				highestMonth = monthArray[month];
				highest = rainfall[month];
			}
			if (rainfall[month] < lowest){
				lowestMonth = monthArray[month];
				lowest = rainfall[month];
			}
		}
		//display total, highest, lowest
		System.out.println("Total Rainfall is "+ total);
		System.out.println("Highest Rainfall is " + highest + " in " + highestMonth);
		System.out.println("Lowest Rainfall is " + lowest + " in " + lowestMonth);
	}

}
