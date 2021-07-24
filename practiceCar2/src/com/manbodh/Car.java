package com.manbodh;

import java.util.ArrayList;

public class Car {
	private ArrayList<CarPart> carParts;
	
	public Car() {
		carParts = new ArrayList<CarPart>();
		carParts.add(new Engine("V8 4.6L", 80));
		carParts.add(new GasTank("15 Gallon gas Tank", 100, 0));
		carParts.add(new Tires( "P205/65R15 92T", 20, 85));
		carParts.add(new Mt5(1, 25));
	}
public void run() {
	for (int i = 0; i < carParts.size(); i++) {
		carParts.get(i).function();
		carParts.get(i).status(75);
	}

}
	
	

}
