package com.bayamp.traning.math;

public class Subtraction {

	/**
	 * @Author : Jansi This calss is to substract my income vs expenses and
	 *         gives my saving for the particular month
	 */
	public static void main(String[] args) {

		long totalIncome = TotalIncome(5000, 2000, 0);
		long totalExpenses = TotalExpenses(2000, 300, 200, 350);

		long mySavingsAre = totalIncome - totalExpenses;

		System.out
				.println(" These are my saving for the particular month after calculating my income and expenses  "
						+ mySavingsAre);

	}

	public static long TotalIncome(int mysalary, int rentincome, int wifesalary) {

		System.out.println("The value for mysalary is " + mysalary);
		System.out.println("The value for rentincome is " + rentincome);
		System.out.println("The value for wifesalary is " + wifesalary);

		long totalIncome = mysalary + rentincome + wifesalary;

		System.out.println("This is my total income " + totalIncome);

		return totalIncome;

	}

	public static long TotalExpenses(int rent, int food, int gas, int others) {

		System.out.println("The value for rent is " + rent);
		System.out.println("The value for food is " + food);
		System.out.println("The value for gas is " + gas);
		System.out.println("The value for others is " + others);

		long totalExpenses = rent + food + gas + others;

		System.out.println("This is my total expenses " + totalExpenses);

		return totalExpenses;

	}
	
	void bonus(){
		
	}
	
	void stocks(){
		
	}

}
