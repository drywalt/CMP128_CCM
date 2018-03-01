package week7;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		int speed, hours, total;
		Scanner scanner = new Scanner(System.in);
		//use a while loop to validate the speed 0 or greater
		System.out.print("Enter the speed ");
		speed = scanner.nextInt();
		while (speed < 0){
			System.out.println("The speed must be 0 or greater");
			System.out.print("Enter the speed");
			speed = scanner.nextInt();
		}
		
		//use a while loop to validate the hours is 1 or greater
		System.out.println("Enter the number of hours ");
		hours = scanner.nextInt();
		while (hours < 1){
			System.out.println("The hours must be greater than 1");
			System.out.println("Enter the number of hours ");
			hours = scanner.nextInt();
		}
		
		//use a while loop to output the hours and distance
		System.out.println("Hours\t\tDistance Traveled");
		System.out.println("---------------------------------");
		int travelTime = 1;
		while (travelTime <= hours){
			total = speed * travelTime;
			System.out.println(travelTime + "\t\t" + total);
			travelTime++;
		}

	}

}
