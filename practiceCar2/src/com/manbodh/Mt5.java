package com.manbodh;

public class Mt5 extends CarPart {

	String mt5 =" manual transmission 5 speed ";
	private int gear;
	
	private String rev = "Reverse";
	private String neu = "Neutral";
	public int condition;

	public Mt5(  int gear, int condition ) {
		super();
		
		this.gear = gear;
		this.condition = condition;
	
	}

	
	
	public int getCondition() {
		return condition;
	}



	public void setCondition(int condition) {
		this.condition = condition;
	}



	public String getRev() {
		return rev;
	}



	public void setRev(String rev) {
		this.rev = rev;
	}



	public String getNeu() {
		return neu;
	}



	public void setNeu(String neu) {
		this.neu = neu;
	}



	public String getMt5() {
		return mt5;
	}

	public void setMt5(String Mt5) {
	
	
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}



	public void status(int condition) {
		if (condition >= 75 && condition <= 100) {
			System.out.println("Condition of " + getMt5() + " is rated at " + getCondition()
					+ " out of 100, and is considered above average condition.");
		} else if (condition >= 50 && condition < 75) {
			System.out.println("Condition of " + getMt5() + " is rated at " + getCondition()
					+ " out of 100, and is considered average condition.");
		} else if (condition < 50 && condition > 1) {
			System.out.println("Condition of " + getMt5() + " is rated at " + getCondition()
					+ " out of 100, and is considered below average condition.");
		} else if (condition < 1) {
			System.out.println("Condition of " + getMt5() + " is rated at " + getCondition()
					+ " out of 100, and is considered broken and needs repair.");
		}
	}

	public void getInGear(int gear) {

		if (gear < 1) {
			System.out.println("Curently in " + getRev());
		}
		if(gear == 0) {
			System.out.println("Currently in " + getNeu());
		}

		if (gear > 5 ) {
			System.out.println("Invalid Gear");
		}
		if (gear == 1) {
			System.out.println("Currently in " + getGear() + "st gear. " + " 1st gear is capable of 1-25 mph");
		}

		if (gear == 2) {
			System.out.println("Currently in " + getGear() + "nd gear. " + " 2nd gear is capable of 26-38 mph");
		}
		if (gear == 3) {
			System.out.println("Currently in " + getGear() + "rd gear. " + " 3rd gear is capable of 38-60 mph ");
		}
		if (gear == 4) {
			System.out.println("Currently in " + getGear() + "th gear. " + " 4th gear is capable of 60-85 mph");
		}
		if (gear == 5) {
			System.out
					.println("Car is currently in " + getGear() + "th gear. " + " 5th gear is capable of 85-105 mph ");
		}

	}

	public void function() {
		getInGear(gear);
	}
}
