package day10;

public class Greater {
	public static void main(String[] args) {
		double res = greater100(155.5);
		System.out.println(res); // 155.5

		res = greater100(2.2);
		System.out.println(res); // 100.0
	}

	public static double greater100(double dNum) {
		if (dNum > 100.0) {
			return dNum;
		} else {
			return 100.0;
		}
	}
}
