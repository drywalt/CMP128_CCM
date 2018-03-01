package week7;

import java.util.Scanner;

public class DetermineGrade {

	public static void main(String[] args) {
		double gradePct;
		char letterGrade;
		Scanner scanner = new Scanner(System.in);
		int numStudents = 0;
		//ask user to enter the number of students
		System.out.println("How many students are there?");
		numStudents = scanner.nextInt();
		
		for (int students = 1; students <= numStudents; students++) {
			//gradePct must be between 0 and 100
			//validation loop
			do {
				System.out.print("Enter the grade percentage for student " + students +": ");
				gradePct = scanner.nextDouble();
				if ((gradePct < 0) || (gradePct > 100)){
					System.out.println("The grade percentage must be between 0 and 100");
				}
			}while ((gradePct < 0) || (gradePct > 100));
			//letter grade
			if (gradePct >= 90){
				letterGrade = 'A';
			}
			else if (gradePct >= 80){
				letterGrade = 'B';
			}
			else if (gradePct >= 70){
				letterGrade = 'C';
			}
			else if (gradePct >= 60){
				letterGrade = 'D';
			}
			else {
				letterGrade = 'F';
			}
				
			System.out.println("The letter grade is " + letterGrade);
		}
	}

}





