package com.manbodh;

public class Icici extends Bank{

	private float interest = .07f;

	public void getRateOfInterest(float money) {
		System.out.println("The rate of interest for ICICI amount:" + money + "$" + " is " + (money * interest) + "$");
	}






	
}
