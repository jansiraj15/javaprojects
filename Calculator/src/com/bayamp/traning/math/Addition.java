package com.bayamp.traning.math;

public class Addition {

	/**
	 * @Author : Jansi This program is about to add my total family income
	 */
	// Global variables
	public static int salary = 5000;
	public static int rentincome = 2000;

	// Main Method
	public static void main(String[] args) {

		long total = AddTotalIncome(salary, rentincome);
		System.out.println("This is the toal income for my family  " + total);

	}

	// Function with static definition

	public static long AddTotalIncome(int parameter1, int parameter2) {
		System.out.println("The value of the parameter1 is " + parameter1);
		System.out.println("The value of the parameter2 is " + parameter2);

		long total = parameter1 + parameter2;

		return total;

	}

	// Function with non static definition

	void WifeSalary() {
		System.out.println("This is my wife income is 0");

	}

	// Function with non static definition

	void OtherIncomes() {
		System.out.println("Other incomes for my family is 0");
	}

}
