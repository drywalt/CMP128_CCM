package week7;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		double itemCost = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the item cost:");
		itemCost = scanner.nextDouble();
		for (int day = 5; day >= 1; day--){
			itemCost = itemCost * .95;  //itemCost *= .95;
			System.out.println("The new cost is " + itemCost);
		}
	}

}
