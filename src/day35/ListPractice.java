package day35;

import java.util.ArrayList;
import java.util.Arrays;

public class ListPractice {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 2, 3, 10, 39, 25, 4));
		System.out.println("sum: " + sumOfEven(list)); // sum: 20 
		
		list = new ArrayList<>(Arrays.asList(4, 4));
		System.out.println("sum: " + sumOfEven(list)); // sum: 8
		
		
	}
	
	// [4, 2, 3, 10, 39, 25, 4] -> 20
	public static int sumOfEven(ArrayList<Integer> list) {
		int evenSum = 0;
		
		for (Integer number : list) {
			if (number % 2 == 0) {
				evenSum += number;
			}
		}
		
		return evenSum;
	}
}
