package week3;
import java.util.Scanner;
public class BMICalculator {

	public static void main(String[] args) {
		int age, weight, feet, inches, maxHR, totalInches;
		double bmi;
		String name;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name: ");
		name = scan.nextLine();
		System.out.print("Enter your age: ");
		age = scan.nextInt();
		//continue to prompt
		feet = 5;
		inches = 5;
		totalInches = feet*12 +inches;
		maxHR = 220-age;
		weight = 175 ;
		bmi = (weight * 703.0)/totalInches * totalInches;
		bmi = (weight * 703.0)/Math.pow(totalInches, 2);
		//output
	}

}
