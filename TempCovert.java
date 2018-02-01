package week3;

import java.util.Scanner;

public class TempCovert {

	public static void main(String[] args) {
		//read in a temperature in Fahrenheit 
		//program will convert to Celcius and output
		//subtract 32 and multiply by 5/9
		double fTemp, cTemp;
		String input;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Fahrenheit temp: ");
		input = scan.nextLine();
		fTemp = Double.parseDouble(input);
		cTemp = (fTemp - 32) * 5.0/9.0;  //implicit casting
		System.out.println(fTemp + " degrees fahreheit");
		System.out.println(cTemp + " degrees celcius");	
	}

}
