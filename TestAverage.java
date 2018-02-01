package week3;
import java.util.Scanner;  //to read input from console

public class TestAverage {

	public static void main(String[] args) {
		 int testScore1, testScore2, testScore3;
		 double average;
		 //System.in refers to Console
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the value of testScore1 ");
		 testScore1 = scan.nextInt();
		 System.out.print("Enter the value of testScore2 ");
		 testScore2 = scan.nextInt();
		 System.out.print("Enter the value of testScore3 ");
		 testScore3 = scan.nextInt();
		 //calculate the average
		 average = (testScore1+testScore2+testScore3)/3.0;
		 System.out.println("Test Score 1: " + testScore1);
		 System.out.println("Test Score 2: " + testScore2);
		 System.out.println("Test Score 3: " + testScore3);
		 System.out.println("The average is " + average);
		 scan.close();
	}

}
