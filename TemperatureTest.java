package week12;

public class TemperatureTest {

	public static void main(String[] args) {
		System.out.println("Fahrenheit\tCelsius");
		System.out.println("-----------------------");
		for (int f = 0; f <= 20; f++){
			//double c = convertToCelsius(f);
			//System.out.println(f + "\t\t" + c);
			System.out.println(f + "\t\t" + convertToCelsius(f));
		}

	}
	//method to convert from fahrenheit to celsius
	//name: convertToCelsius, return double, one parameter 
	public static double convertToCelsius(double fTemp){
		double cTemp;
		cTemp = 5.0/9.0 * (fTemp -32);
		return cTemp;
	}
	

}
