package com.abslab;

public class Employee extends Person implements Bills{

	
	@Override
	public double taxes(double amount) {
		
		return amount * .2;
		
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
