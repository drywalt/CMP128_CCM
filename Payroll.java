package week5;
import javax.swing.JOptionPane;
public class Payroll {

	public static void main(String[] args) {
		double hours, payrate, taxrate, grosspay, netpay;
		String input;
		char status;
		input = JOptionPane.showInputDialog("Enter the hours worked");
		hours = Double.parseDouble(input);
		input = JOptionPane.showInputDialog("Enter the pay rate");
		payrate = Double.parseDouble(input);
		input = JOptionPane.showInputDialog("Enter your marital status");
		input = input.toUpperCase();
		status = input.charAt(0);
		if (hours <= 40){
			grosspay = hours * payrate;
		}
		else {
			grosspay = (40 *payrate) + (hours - 40)*payrate * 1.5;
		}
		if (status == 'S'){
			taxrate = .15;
		}
		else if (status == 'M') {
			taxrate = .22;
		}
			
	}

}
