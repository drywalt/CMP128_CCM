package week12;

import java.util.Scanner;

//This program will use methods to read the length and width
//of a room from the user.  It will use a method to calculate the
//area.  It will use a method to display the length, width, and area.

public class RectangleArea {

	public static void main(String[] args) {
		double length, width, area;
		length = getLength();
		width = getWidth();
		area = calcArea(length, width);
		displayData(length, width, area);

	}
	//method to read the length; validate that the length > 0
	//name: getLength, no parameters, return double
	public static double getLength(){
		double length = 0;
		Scanner scanner = new Scanner(System.in);
		do
		{
			System.out.print("Enter the length of the room: ");
			length = scanner.nextDouble();
			if (length <= 0){
				System.out.println("Invalid. The length must be greater than 0");
			}
		}while (length <= 0);
		return length;
	}
	
	//method to read the width; validate that the width > 0
	//name: getWidth, no parameters, return double
	public static double getWidth(){
		double width = 0;
		Scanner scanner = new Scanner(System.in);
		do
		{
			System.out.print("Enter the width of the room: ");
			width = scanner.nextDouble();
			if (width <= 0){
				System.out.println("Invalid. The width must be greater than 0");
			}
		}while (width <= 0);
		return width;
	}
	//method to calculate the area
	//name: calcArea, 2 parameters, return double
	public static double calcArea(double len, double wid){
		double area = 0;
		area = len * wid;
		return area;
	}
	
	//method to display the data
	//name: displayData, 3 parameters, return void
	public static void displayData(double len, double wid, double a){
		System.out.println("Length: " + len);
		System.out.println("Width: " + wid);
		System.out.println("Area: " + a);
	}

}





