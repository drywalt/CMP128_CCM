package week6;

public class Page183Ex {

	public static void main(String[] args) {
		//number 4
		int hours;
		boolean minimum = true;
		
		if (minimum == true){
			hours = 10;
		}

		//number 5
		int amount1, amount2;
		amount1 = 15;
		amount2 = 20;
		
		//if ((amount1 >10) && (amount2 < 100))
		if (amount1 > 10){
			if (amount2 < 100){
				if (amount1 > amount2){
					System.out.println(amount1);
				}
				else {
					System.out.println(amount2);
				}
			}
		}
		
		//number 7
		int temperature = 175;
		if ((temperature >= -50) && (temperature <= 150)){
			System.out.println("The number is valid");
		}
		
		//number 3
		double commission, sales = 13000;
		if(sales <= 10000){
			commission = .10;
		}
		else if (sales <= 15000){
			commission = .15;
		}
		else {
			commission = .20;
		}
		
	}

}







