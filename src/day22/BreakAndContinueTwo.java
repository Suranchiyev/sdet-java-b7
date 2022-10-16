package day22;

public class BreakAndContinueTwo {
	public static void main(String[] args) {
		// continue - it skips the rest of the code in the iteration and moves to the
		//            next one.
		
		for (int i = 1; i <= 15; i++) {
			// 7, 9, 13
			if (i == 7 || i == 9 || i == 13) {
				continue;
			}
				
			System.out.print(i + " ");
		}
		
		System.out.println();
	}
}
