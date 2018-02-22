package week6;
import javax.swing.JOptionPane;
public class CompoundDecisions {

	public static void main(String[] args) {
		//check if a value is within a range
		//if not, display an error
		char status;
		int grade;
		String input;
		input = JOptionPane.showInputDialog("Enter a grade between 0 and 100");
		grade = Integer.parseInt(input);
		
		//grade = Integer.parseInt(JOptionPane.showInputDialog("Enter a grade between 0 and 100")); 
		
		if ((grade >= 0) && (grade <= 100)){
			JOptionPane.showMessageDialog(null, "That is a valid grade");
			//if, else if, else
		}
		else {
			JOptionPane.showMessageDialog(null, "That grade is invalid");
		}
		
		if ((grade < 0) || (grade > 100)){
			JOptionPane.showMessageDialog(null, "That grade is invalid");
		}
		
		input = JOptionPane.showInputDialog(
				"Enter the marital status: M for married, "+
				"S for Single, D for Divorced, W for Widowed");
		//makes input uppercase, then get the 1st character
		status = input.toUpperCase().charAt(0); 
		//good validation
		if((status != 'M') && (status != 'S') && (status != 'D') && 
				(status != 'W')){
			JOptionPane.showMessageDialog(null,"Invalid Marital Status");
		}
		//does not validate
		if((status != 'M') || (status != 'S') || (status != 'D') || 
				(status != 'W')){
			JOptionPane.showMessageDialog(null,"Invalid Marital Status");
		}
		
		if((status == 'M') || (status == 'S') || (status == 'D') || 
				(status == 'W')){
			JOptionPane.showMessageDialog(null,"Valid Marital Status");
		}
		else {
			JOptionPane.showMessageDialog(null,"Invalid Marital Status");
		}
		
	}

}




