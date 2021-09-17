package com.abslab;

public abstract class Person {
	protected String firstName;
	protected String lastName;

	public abstract double taxes(double amount); {
	
	}
	public double calculateTelePhoneBill(double amount) {
		return this.taxes(amount) + amount;
		
		
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
