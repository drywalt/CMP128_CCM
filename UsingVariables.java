package week2;

public class UsingVariables {

	public static void main(String[] args) {
		//declare different types of variables
		int quantity;
		double cost, subtotal, grandtotal; 
		String itemName;
		
		itemName = "CMP 128 Textbook";  //assignment
		quantity = 6;
		cost = 45.99;
		
		//calculations
		subtotal = quantity * cost;
		grandtotal = 1.07 * subtotal;
		
		System.out.println(itemName);  //print the itemName to console
		System.out.println("You purchased " + quantity + " items");
		System.out.println("Your subtotal is $"+ subtotal);
		System.out.println("Your grandtotal is $" + grandtotal);
	}

}
