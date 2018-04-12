package week12;

import java.util.Scanner;

public class MethodsTest {

	public static void main(String[] args) {
		double difficulty;
		difficulty = getDegreeOfDifficulty();
		System.out.println(difficulty);

	}
	
	//this method will prompt for and read the
	//degree of difficulty of a dive and validate
	//that the value is between 1 and 1.67
	//before returning the value
	public static double getDegreeOfDifficulty(){
		//declare variable
		double degreeOfDifficulty = 0;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Enter the degree of difficulty: ");
			degreeOfDifficulty = scanner.nextDouble();
			if ((degreeOfDifficulty < 1) || (degreeOfDifficulty > 1.67)){
				System.out.println("Invalid.  Value must be between 1 and 1.67");
			}
		}while((degreeOfDifficulty < 1) || (degreeOfDifficulty > 1.67));
		return degreeOfDifficulty;  //return value to calling statement
	}
	

}



