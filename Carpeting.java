package week1;
//This is a single line comment.

/* This is a 
 * multi-line comment.
 * More comment here.
 */

//January 17, 2018
//This is out first Java program.
//It will print stuff out.
public class FirstProgram {

	public static void main (String [] args) {
		System.out.println("This is my first Java program");
		System.out.println("Let's hope it works");
		System.out.print("January\t\t");
		System.out.print("17, 2018");
		System.out.println("\n\n\nIt is Wednesday");
		//variables
		double hours_worked;
		double hourly_rate;
		double gross_pay;
		
		//double hours_worked, hourly_rate, gross_pay;
		hours_worked = 25;
		hourly_rate = 12.50;
		gross_pay = hours_worked * hourly_rate;
		System.out.print("Your gross pay is ");
		System.out.println(gross_pay);
		System.out.println("Your gross pay is " + gross_pay);
	}
}

