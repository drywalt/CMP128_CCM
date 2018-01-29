package week2;
import javax.swing.JOptionPane;

public class CarpetingDialog {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Carpet Calulator");
		JOptionPane.showMessageDialog(null, "You will need to enter "+
				 "the length, width, and cost per square yard");
		double length, width, area, waste, costPerSqYard, totalCost;
		String input;
		//input dialog to enter the length
		input = JOptionPane.showInputDialog("What is the length of the room?");
		//converts input to a double
		length = Double.parseDouble(input);
		input = JOptionPane.showInputDialog("What is the width of the room?");
		width = Double.parseDouble(input);
		input = JOptionPane.showInputDialog("What is the cost per sqare yard?");
		costPerSqYard = Double.parseDouble(input);
		area = length * width;
		waste = area * .15;
		area += waste;
		totalCost = area/9 * costPerSqYard;
		JOptionPane.showMessageDialog(null, "The total cost is $" 
										+ totalCost);
	}

}



