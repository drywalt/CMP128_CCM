package week14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  //event handling classes

//this frame will allow the user to enter their age, height, 
//weight, and age and will display their BMI and Max Heart Rate

//implements is for Event Handling
public class BMIFrame extends JFrame implements ActionListener{
	//components
	JLabel ageLabel = new JLabel("Age");
	JLabel weightLabel = new JLabel("Weight");
	JLabel ftLabel = new JLabel("Height (Ft)");
	JLabel inchLabel = new JLabel("Height (In)");
	JTextField ageText = new JTextField(10);
	JTextField weightText = new JTextField(10);
	JTextField ftText = new JTextField(10);
	JTextField inchText = new JTextField(10);
	JButton calculateBtn = new JButton("Calculate");
	JButton clearBtn = new JButton("Clear");
	
	//method with same name as class
	public BMIFrame(){
		//set title, size, visible, close operation, layout
		setTitle("BMI Calculator");
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(5,2)); //grid with 5 rows, 2 columns
		//call buildFrame
		buildFrame();
		calculateBtn.addActionListener(this);  //add listener to button
		clearBtn.addActionListener(this);
	}
	
	//method to build the frame
	public void buildFrame(){
		add(ageLabel);
		add(ageText);
		add(weightLabel);
		add(weightText);
		add(ftLabel);
		add(ftText);
		add(inchLabel);
		add(inchText);
		add(calculateBtn);
		add(clearBtn);
	}

	//method to handle the actions for events
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == calculateBtn){
			//JOptionPane.showMessageDialog(null, "Calculate");
			int weight, feet, inches, age;
			double bmi;
			int maxHR;
			age= weight=feet=inches=0;
			//getText() gets the String entered in the text field
			age = Integer.parseInt(ageText.getText());
			weight =Integer.parseInt(weightText.getText());
			feet = Integer.parseInt(ftText.getText());
			inches = Integer.parseInt(inchText.getText());
			inches += (feet*12);
			
			System.out.println(inches + "  " + feet);
			System.out.println(weight);
			bmi = (weight * 703.0)/(inches*inches);
			maxHR = 220-age;
			JOptionPane.showMessageDialog(null, bmi + " " + maxHR);
		}
		else {
			//JOptionPane.showMessageDialog(null, "Clear");
			weightText.setText("");
			ageText.setText("");
			ftText.setText("");
			inchText.setText("");
		}
		
	}
}




