package week12;

import java.util.Scanner;

public class RainfallWithMethods {

	public static void main(String[] args) {
		//rainfall array
		double [] rainArray = new double[12];
		//months array
		String [] monthsArray = {"January", "February", "March", "April",
								"May", "June", "July", "August", "September",
								"October", "November", "December"};
		//call the getRainfall method
		//only use the name of the array in the method call
		getRainfall(rainArray, monthsArray);
		
		for (int i = 0; i < monthsArray.length; i++){
			System.out.println(monthsArray[i] + "\t" + rainArray[i]);
		}
		double totalRain = calcTotalRainfall(rainArray);
	}
	//method to read the amount of rain for each month
	public static void getRainfall(double [] rain, String [] months){
		Scanner scanner = new Scanner(System.in);
		for (int i =0; i < months.length; i++){
			System.out.println("Enter the amount of rain for " + months[i] + " ");
			rain[i] = scanner.nextDouble();
		}
	}
	
	public static double calcTotalRainfall(double [] rain){
		double total = 0;
		for (int i=0; i < rain.length; i++){
			total += rain[i];  //accumulate total
		}
		return total;
	}

}




