package week11;
import java.util.Scanner;
public class ArrayIntro {

	public static void main(String[] args) {
		//declare array of 10 integers
		int [] intArray = {32, 63, 47, 16, 82,
							50, 99, 3, 9, 0};
		int total = 0, highest = intArray[0], lowest = intArray[0];
		
		//for loop to accumulate the total for the array values
		for (int counter = 0; counter < intArray.length; counter++){
			total += intArray[counter];
			//check for highest
			if (intArray[counter] > highest){
				highest = intArray[counter];
			}
			if (intArray[counter] < lowest){
				lowest = intArray[counter];
			}
		}
		for (int counter = 0; counter < intArray.length; counter++){
			System.out.println(intArray[counter]);
		}
		System.out.println("The total is " + total);
		System.out.println("The highest is " + highest);
		System.out.println("The lowest is " + lowest);
		
	}

}
