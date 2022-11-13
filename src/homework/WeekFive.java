package homework;

import java.util.Arrays;

public class WeekFive {
	public static void main(String[] args) {
		// Note, these examples don't cover full test cases.
		// creditCardCheck("4003600000000014"); // AMEX
		// creditCardCheck("4012888888881881"); // VISA
		creditCardCheck("5105105105105100"); // MASTERCARD
		// creditCardCheck("123"); // INVALID
	}

	public static void creditCardCheck(String creditCard) {
		if (creditCard.contains("-")) {
			System.out.println("INVALID");
			return;
		}
	        
		int[] arr = new int[creditCard.length()];
		for (int i = 0; i < creditCard.length(); i++) { // looping throug string
			arr[i] = Integer.parseInt(creditCard.charAt(i) + ""); // turning string to int char by char
		}
		
		int sum = 0;
		for (int i = arr.length - 2; i >= 0; i -= 2) {
			int multiply = arr[i] * 2;
			if (multiply > 9) {
				int digitOne = multiply / 10;
			    int digitTwo = multiply % 10;
			    sum += (digitOne + digitTwo);
			} else {
				sum += multiply;
			}
		}
		
		for (int i = arr.length - 1; i >= 0; i -= 2) {
			sum += arr[i];
		}
		
	
		if (sum % 10 == 0) {
			// VALID
			// TODO figure out which card it is
		} else {
			System.out.println("INVALID");
		}

	}
}
