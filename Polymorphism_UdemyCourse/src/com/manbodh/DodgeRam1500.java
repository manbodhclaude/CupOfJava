package com.manbodh;

public class DodgeRam1500 extends Car {


	private int wheels;
	private String model;
	private String manufacturer;
	private boolean dieselRamEngine;

	public DodgeRam1500(int wheels, String model, String manufacturer, boolean gasEngine, boolean dieselEngine,
			boolean electricEngine) {
		super(wheels, model, manufacturer, gasEngine, dieselEngine, electricEngine);
		this.dieselRamEngine = dieselEngine;
		this.model = model;
		this.manufacturer = manufacturer;
		this.wheels = wheels;
	}

	public void startDodgeEngine(boolean dieselRamEngine) {

		if (dieselRamEngine == true) {
			System.out.println("Diesel engine started...");

		} else {
			System.out.println("Engine not found...");
		}
	}

	public boolean isDieselRamEngine() {
		return dieselRamEngine;
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
