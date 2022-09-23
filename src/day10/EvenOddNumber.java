package day10;

import util.InputFromUser;

public class EvenOddNumber {
	public static void main(String[] args) {
		// How do you can check if number is even or odd?
		// number % 2 == 0 -> even
		
		String numStr = InputFromUser.getInput("Enter any number:");
		int number = Integer.parseInt(numStr);
		
		if (number % 2 == 0) {
			System.out.println(number + " is even");
		} else {
			System.out.println(number + " is odd");
		}
	}
}
