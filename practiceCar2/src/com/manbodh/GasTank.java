package com.manbodh;

public class GasTank extends CarPart {

	public String gasHolder;
	public int num;
	public int condition;
	
	Engine eng = new Engine("V8 4.6L",  100);

	public GasTank(String gasHolder, int condition, int num) {
		super();
		this.gasHolder = gasHolder;
		this.condition = condition;
		this.num = num;
	}
	
	




	public int getCondition() {
		return condition;
	}






	public void setCondition(int condition) {
		this.condition = condition;
	}






	public int getNum() {
		return num;
	}






	public void setNum(int num) {
		this.num = num;
	}






	public String getGasHolder() {
		return gasHolder;
	}

	public void setGasHolder(String gasHolder) {
		this.gasHolder = gasHolder;
	} 
	
	public void status(int condition) {
		if(condition >= 75 && condition <= 100) {
			System.out.println("Condition of " + getGasHolder() + " is rated at " + getCondition() +  " out of 100, and is considered above average condition.");
		}else if(condition >=50 && condition < 75) {
			System.out.println("Condition of " + getGasHolder() + " is rated at " + getCondition() +  " out of 100, and is considered average condition.");
		}
		else if(condition < 50 && condition > 1) {
			System.out.println("Condition of " + getGasHolder() + " is rated at " + getCondition() +  " out of 100, and is considered below average condition.");
		}
		else if(condition < 1) {
		
			System.out.println("Condition of " + getGasHolder() + " is rated at " + getCondition() +  " out of 100, and is considered broken and needs repair.");
		}
	}
	

	public void GasTankGauge(int num) {
		if(num > 15) {
			System.out.println("Gas Overfill, tank cannot hold more then 15 gallons.");
		}
		if (num == 15) {
      System.out.println("Gas Tank is Full");
		}
		
		else if(num < 15 && num >=12) {
			System.out.println("Gas tank is approximately filled at 75%");
			
		}
		else if(num < 12 && num >= 7 ) {
			System.out.println("Gas tank is approximately filled at 50%");
		}

		else if(num < 7 && num >= 1) {
			System.out.println("Gas tank is approximately filled at 25%");
		}
		else {
			if(num < 1) {
				
			eng.engineMethod(true);
				System.out.println("No Gas, please add fuel before attempting to start car");
			}
		}
		
	
	}
	
	
	public void function() {
		
		GasTankGauge(num);

	}
	
	
}

