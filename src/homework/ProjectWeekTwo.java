package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ProjectWeekTwo {
	public static void main(String[] args) {
		String name = InputFromUser.getInput("Enter your name:");
		int pounds = Integer.parseInt(InputFromUser.getInput("Enter your weight in pounds:"));
		int feet = Integer.parseInt(InputFromUser.getInput("Enter your height in feet:"));
		int inches = Integer.parseInt(InputFromUser.getInput("and inches:"));

		double mass = getMassInKilograms(pounds);
		double heightMeters = getHeightInMeters(feet, inches);
		double bmi = calculateBMI(mass, heightMeters);
		String healthRisk = getHealthRiskBasedOnBMI(bmi);

		System.out.println("Name: " + name);
		System.out.println("BMI: " + bmi);
		System.out.println("Health risk: " + healthRisk);
	}

	public static double getMassInKilograms(int pounds) {
		return pounds / 2.2;
	}

	public static double getHeightInMeters(int feet, int inches) {
		return (inches + (feet * 12)) * 0.0254;
	}

	public static double calculateBMI(double massInKilo, double heightInMeters) {
		// BMI = massInKilo / (heightInMeters * heightInMeters);
		return massInKilo / (heightInMeters * heightInMeters);
	}

	public static String getHealthRiskBasedOnBMI(double bmi) {

		if (bmi < 18.5) {
			return "Underweight";
		} else if (bmi >= 18.5 && bmi < 25) {
			return "Normal";
		} else if (bmi >= 25 && bmi < 30) {
			return "Overweight";
		} else if (bmi >= 30) {
			return "Obese";
		} else {
			return "Undefined";
		}
	}
}

// do not change this code, program needs this code for testing purposes only
class InputFromUser {
	public static boolean isRunFromTest = false;
	public static List<String> input;
	public static int index = 0;

	public static String getInput(String msg) {
		if (isRunFromTest) {
			return input.get(index++);
		} else {
			try {
				BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
				System.out.println(msg);
				return buffReader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}

	}

	public static String getInput() {
		if (isRunFromTest) {
			return input.get(index++);
		} else {
			try {
				BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
				return buffReader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}
}