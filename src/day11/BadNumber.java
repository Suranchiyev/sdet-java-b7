package day11;

import util.InputFromUser;

public class BadNumber {
	public static void main(String[] args) {
		// 13 is bad number, rest are regular numbers
		int number = Integer.parseInt(InputFromUser.getInput("Enter number:"));
		System.out.println("Number: " + number);
		badNumber(number);
	}
	
	public static void badNumber(int number) {
		// TODO if number is 13 print "<number> is bad number"
		//      otherwise, print "<number> is regular number"
		
		if (number == 13) {
			System.out.println(number + " is bad number"); 
		} else {
			System.out.println(number + " is regular number");
		}
	}
}

