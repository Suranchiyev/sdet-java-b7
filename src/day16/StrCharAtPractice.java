package day16;

public class StrCharAtPractice {
	public static void main(String[] args) {
		 printLastChar("hello"); // o
		 printLastChar("apple"); // e
		 printLastChar("Alex"); // x
		 printLastChar("Bek"); // k
		 printLastChar("A"); // A
	}
	
	/*
	 * Print last char of argument str by using charAt(int index) method
	 * printLastChar("hello"); o
	 * printLastChar("apple"); e
	 * printLastChar("Alex"); x
	 * printLastChar("Bek"); k
	 * printLastChar("A"); A
	 * 
	 */
	public static void printLastChar(String str) {
		// 01234
		// hello 5 - 4
		// apple 5 - 4
		// Alex  4 - 3
		// Bek   3 - 2
		// A     1 - 0
		
		int strLength = str.length();
		char ch = str.charAt(strLength - 1);
		System.out.println(ch);
	}
}
