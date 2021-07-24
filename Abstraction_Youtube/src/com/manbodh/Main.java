package com.manbodh;

abstract class Dog{
	public void bark() {
		System.out.println("Woof woof...");
	}
	
	public abstract void poop();
}

class Chihuahah extends Dog{

	@Override
	public void poop() {
		System.out.println("pooping...");		
	}
	
}


public class Main {

	public static void main(String[] args) {
	
		Chihuahah a = new Chihuahah();
		//a.bark();
		a.poop();

	}

}
