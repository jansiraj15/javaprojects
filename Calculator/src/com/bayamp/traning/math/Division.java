package com.bayamp.traning.math;

public class Division {

	/**
	 * @Author : Jansi This calss is to divide the gift price with 8 people
	 */
	public static void main(String[] args) {

		long priceValuePerPerson = divideTheGiftPrice(1000000);
		System.out.println("The gift value for each person is "
				+ priceValuePerPerson);

	}

	public static long divideTheGiftPrice(int priceValue) {

		long priceValuePerPerson = priceValue / 8;

		// System.out.println("The gift value for each person is " +
		// priceValuePerPerson);

		return priceValuePerPerson;

	}
	
	void otherGiftPrice(){
		
	}

}
