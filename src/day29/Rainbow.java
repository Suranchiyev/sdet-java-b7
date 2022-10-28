package day29;

public class Rainbow {
	public static void main(String[] args) {
		//                   0       1         2         3       4        5         6
		String[] color = { "red", "orange", "yellow", "green", "blue", "indigo", "violet" };

		// Loop over(read each element one by one) the array by using for loop
		for (int i = 0; i < color.length; i++) {
			System.out.println(color[i].toUpperCase());
		}

		// Ctrl + Shift + F
	}
}
