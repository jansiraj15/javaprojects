package com.bayamp.traning.math;

public class General {

	/**
	 * @Author : Jansi
	 * 
	 */
	/*public static void main(String[] args) {

		int ascii = charToAscii('A');
		System.out.println("The ascii value for the character is " + ascii);

		double averagevalue = caluculateAvgValue(30, 55);
		System.out.println("The average value " + averagevalue);

		double squareOfAValue = squareRootOfANumber(4500);
		System.out.println("The square root of a number is " + squareOfAValue);

		double expOfANumber = exponentialOfANumber(10);
		System.out.println(" The Exponential of a number is " + expOfANumber);

	}*/

	// Define a function to convert A character to ascii

	public static int charToAscii(char character) {
//casting
		
		int ascii = (int)character;

		// System.out.println("The ascii value for the character is " + ascii);

		return ascii;

	}

	// Define a function to calculate the average value

	public static double caluculateAvgValue(int number1, int number2) {

		double averagevalue = (number1 + number2) / 2;
		// System.out.println("The average value "+ averagevalue);

		return averagevalue;

	}

	// A method which calculates the square root of a number and returns the
	// value

	public static double squareRootOfANumber(double value) {

		double squareOfAValue = Math.sqrt(value);

		// System.out.println("The square root of a number is " +
		// squareOfAValue);

		return squareOfAValue;

	}

	// A method which calculates the exponential of a number and returns the
	// value

	public static double exponentialOfANumber(double number) {

		double expOfANumber = Math.exp(number);
		// System.out.println(" The Exponential of a number is " +
		// expOfANumber);

		return expOfANumber;

	}

	public static long checkTheNumberIsPrimeNoOrNot(int number) {

		return 0;

	}
}