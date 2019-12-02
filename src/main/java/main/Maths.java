package main;

public class Maths {

	static int num1 = 5;
	static int num2 = 2;

	static double num3 = 5;
	static double num4 = 2;

	public static void main(String[] args) {

		System.out.println("Addition: " + addition(num1, num2));
		System.out.println("Subtraction: " + subtraction(num1, num2));
		System.out.println("Multiplication: " + multiplication(num1, num2));
		if (division(num3, num4) != null) {
			System.out.println("Division: " + division(num3, num4));
		}
	}

	private static int addition(int num1, int num2) {
		return num1 + num2;
	}

	private static int multiplication(int num1, int num2) {
		return num1 * num2;
	}

	private static int subtraction(int num1, int num2) {
		return num1 - num2;
	}

	private static Double division(double num3, double num4) {
		if (num3 < num4) {
			return num3 / num4;
		} else {
			System.out.println("Division cannot be performed");
			return null;
		}
	}
}