package com.bayamp.traning.math;

public class Addition1 {

	public static int addTwoNumbers(int number1, int number2) {
		int totalValue = number1 + number2;
		
		return totalValue;
	}

	public String addFirstnameAndLastname(String fname, String lname) {
		String firstNameAndlastName = fname + " " + lname;
		
		return firstNameAndlastName;
	}
	
	public int addTotalMarks(int english, int maths , int socialscience, int computers){
		int myTotalMarksAre = english+ maths + socialscience + computers;
		
		return myTotalMarksAre;
	}
	
	public static double addTotalIncome(double salary, double myRentIncome ){
	double totalIncomeForMyFamily = salary + myRentIncome;
		
		return totalIncomeForMyFamily;
	}
}
