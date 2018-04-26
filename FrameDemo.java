package week14;
import javax.swing.*;  //components and JFrame
import java.awt.*;  //Layouts and Container

//this class is used to build the frame

public class FrameDemo extends JFrame{
	//create some components for frame
	JLabel nameLabel = new JLabel("Enter your name");  //set the text of the label
	JTextField nameText = new JTextField(12);  //width of 12
	JButton okButton = new JButton("OK"); //set the text of the button
	JRadioButton rb1 = new JRadioButton("1");  //text is 1
	JRadioButton rb2 = new JRadioButton("2");  //text is 2
	JRadioButton rb3 = new JRadioButton("3");  //text is 3
	JCheckBox cbAgree = new JCheckBox("I agree"); //check box with text I agree
	
	//no main in this class!

	//method to build the frame
	//this method must have the same name as the class
	public FrameDemo(){
		setTitle("My First Frame"); //set the title of frame
		setSize(350, 250); //size of frame (width, height)
		
		//the following 4 lines will center the frame on your screen
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - getHeight()) / 2);
	    setLocation(x, y);
		
	    setVisible(true); //set the frame visible
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());  //sets JFrame to use Flow Layout
		buildFrame(); //call the method
	}
	
	//create a method to put the components on the frame
	public void buildFrame(){
		ButtonGroup rbGroup = new ButtonGroup();  //used to group radio buttons
		rbGroup.add(rb1); //add the rb to group
		rbGroup.add(rb2); //add the rb to group
		rbGroup.add(rb3); //add the rb to group
		
		add(nameLabel); //adds the component to frame
		add(nameText);	//adds the component to frame
		add(rb1);
		add(rb2);
		add(rb3);
		add(cbAgree);
		cbAgree.setEnabled(false);
		add(okButton);	//adds the component to frame
		okButton.setVisible(false);
	}
}





