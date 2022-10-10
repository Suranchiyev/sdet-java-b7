package day20;

public class WhileLoop {
	public static void main(String[] args) {	
		int count = 0;
		//        10 < 10 -> false
		while (count < 10) {
			System.out.println("Hello, world!");
			count++;
		}
		System.out.println("Count: " + count);
	}
}
