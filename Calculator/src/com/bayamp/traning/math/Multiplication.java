package com.bayamp.traning.math;

public class Multiplication {

	/**
	 * @Author: Jansi This class is to calculate the mobile bill for an year
	 */
	// Main method
	public static void main(String[] args) {

		long totalMobileBill = calculateMobileBillForAnYear(20);

		System.out.println("This is the total mobile for an year "
				+ totalMobileBill);

	}

	public static long calculateMobileBillForAnYear(int mobilebillforamonth) {

		int totalMobile = mobilebillforamonth * 12;

		// System.out.println("This is the mobile bill for an year " +
		// totalMobile);

		return totalMobile;
	}

	void extraCharges(){
		
	}
}
