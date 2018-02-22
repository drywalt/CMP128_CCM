package week6;

public class StringCompare {

	public static void main(String[] args) {
		//to compare Strings in Java we use a method (function)
		//equals(), equalsIgnoreCase()
		
		String str1, str2;
		str1 = "Wednesday";
		str2 = "Wednesday";
		
		//if (str1.equals("WeDnesDay"))
		if (str1.equals(str2)){
			System.out.println("The strings are equal");
		}
		else {
			System.out.println("The strings are not equal");
		}
		
		if (str1.equalsIgnoreCase(str2)){
			System.out.println("The strings are equal");
		}
		//checks that the strings are not equal
		if (str1.equalsIgnoreCase(str2) == false){
			System.out.println("The strings are not equal");
		}
		//the ! is used as a NOT
		if (!str1.equalsIgnoreCase(str2)){
			System.out.println("The strings are not equal");
		}
	}

}
