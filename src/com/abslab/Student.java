package com.abslab;

public class Student extends Person implements Bills{


	@Override
	public double taxes(double amount) {
		
		return amount * .02;
		
}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	@Override
	public double gasBill(double gasAmount) {

		return 0;
	}

	@Override
	public double carInsurance(double insAmount) {

		return 0;
	}

	
}
