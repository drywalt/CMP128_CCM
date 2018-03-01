package week7;

import java.util.Scanner;

public class DistanceTraveled {

	public static void main(String[] args) {
		int speed, hours, total;
		Scanner scanner = new Scanner(System.in);
		//validate speed
		do {
			System.out.println("Enter the speed");
			speed = scanner.nextInt();
			if(speed<0){
				System.out.println("Speed must be greater than or equal to 0");
			}
		} while(speed < 0);
		//validate hours
		do {
			System.out.println("Enter the number of hours");
			hours = scanner.nextInt();
			if(hours<1){
				System.out.println("Hours must be greater than 1");
			}
		} while(hours < 1);
		
		System.out.println("Hours\t\tDistance Traveled");
		System.out.println("---------------------------------");
		//output hours and distance
		for (int travelTime = 1; travelTime <= hours; travelTime++){
			total = speed * travelTime;
			System.out.println(travelTime + "\t\t" + total);
		}
		
	}

}




