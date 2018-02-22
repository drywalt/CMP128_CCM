package week6;

import javax.swing.JOptionPane;

public class StateTax {

	public static void main(String[] args) {
		String state;
		double salesTax;
		state = JOptionPane.showInputDialog("Enter the state abbreviation");
		//switch case for the salesTax
		switch(state){
			case "NJ":
			case "PA": salesTax = .07; 
				 		break;
			case "NY" : salesTax = .0825;
						break;
			case "VA":  salesTax = .05;
						break;
			default:	salesTax = .06;
						break;
		}

		JOptionPane.showMessageDialog(null, "The sales tax is " + salesTax);
	}

}
