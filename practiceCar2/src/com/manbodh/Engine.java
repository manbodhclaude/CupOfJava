package com.manbodh;

public class Engine extends CarPart {

	public String engineType;
	public boolean off;
	public int condition;
	
	



	public Engine(String engineType, int condition) {
		super();
		this.engineType = engineType;
		
		this.condition = condition;
	}

	public int getCondition() {
		return condition;
	}

	public void setCondition(int condition) {
		this.condition = condition;
	}

	public void engineMethod(boolean off) {
		this.off = off;
		if(off == true) {
			System.out.println("Engine is off");
		}
		if(!off) {
			System.out.println(getEngineType() + " engine is on  ");
		}
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public boolean isOff() {
		return off;
	}

	public void setOff(boolean off) {
		this.off = off;
	}
	

	public void status(int condition) {
		if(condition >= 75 && condition <= 100) {
			System.out.println("Condition of " + getEngine() + " is rated at " + getCondition() +  " out of 100, and is considered above average condition.");
		}else if(condition >=50 && condition < 75) {
			System.out.println("Condition of " + getEngine() + " is rated at " + getCondition() +  " out of 100, and is considered average condition.");
		}
		else if(condition < 50 && condition > 1) {
			System.out.println("Condition of " + getEngine() + " is rated at " + getCondition() +  " out of 100, and is considered below average condition.");
		}
		else if(condition < 1) {
			System.out.println("Condition of " + getEngine() + " is rated at " + getCondition() +  " out of 100, and is considered broken and needs repair.");
		}
	}
	
	public void function() {
		engineMethod(true);
	}
}
