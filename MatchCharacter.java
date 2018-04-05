package week11;

public class MatchCharacter {

	public static void main(String[] args) {
		//declare a string and give it a value
		String word = "Today is Wednesday April 4, 2018";
		//convert the String to all lower case
		word = word.toLowerCase();
		
		//save the String as an array of characters
		char [] letters = word.toCharArray();
		//declare a boolean to keep track if there is a match
		boolean match = false;
		//declare an int to keep track of the number of matches
		int numMatch = 0;
		
		//for loop to check each character for a match
		for (int i = 0; i< letters.length; i++){
			if (letters[i] == ' '){
				match = true;
				numMatch++;
			}
		}
		if (match == true){
			System.out.println("There are " + numMatch + " matches");
		}
		else {
			System.out.println("There are no matches");
		}
		
	}

}
