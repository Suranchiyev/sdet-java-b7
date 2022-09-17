package day07;

import util.InputFromUser;

public class Multiply {
	public static void main(String[] args) {
		int numOne, numTwo;
		
		String strNumOne = InputFromUser.getInput("Enter first number:");
		numOne = Integer.parseInt(strNumOne);
		
		String strNumTwo = InputFromUser.getInput("Enter second number:");
		numTwo = Integer.parseInt(strNumTwo);
		
		int result = numOne * numTwo;
		System.out.println(numOne + " * " + numTwo + " = " + result);
	}
}
