package com.manbodh;

public class MustangGT97 extends Car {
	

    private int wheels;
	private String model;
	private String manufacturer;
	private boolean gasMustangEngine;
	

	public MustangGT97(int wheels, String model, String manufacturer, boolean gasEngine, boolean dieselEngine,
			boolean electricEngine) {
		super(wheels, model, manufacturer, gasEngine, dieselEngine, electricEngine);
		this.gasMustangEngine = gasEngine;
		this.model = model;
		this.manufacturer = manufacturer;
		this.wheels = wheels;
	}
	
	
	public void mustangIgnition(boolean gasMustangEngine) {
		if(gasMustangEngine == true) {
			System.out.println("Gas engine Started...");
			
		}else {
			System.out.println("Engine not found...");
		}
}
	
	
	
	
	
	public boolean isGasMustangEngine() {
		return gasMustangEngine;
	}

	public int getWheels() {
		return wheels;
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}
	
	
	

}
