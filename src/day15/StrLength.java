package day15;

import util.InputFromUser;

public class StrLength {
	public static void main(String[] args) {
		String str = InputFromUser.getInput("What's your name?");
		
		// String has many useful methods that allows us to work with its value		
		// .length() is used to find number of characters in the string
		
		int numberOfChars = str.length();
		System.out.println("Number of chars: " + numberOfChars);
		
		if (numberOfChars > 7) {
			System.out.println("You got long name");
		}
		System.out.println("Nice to meet you!");
	}
}
