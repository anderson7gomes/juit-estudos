package com.anderson.money;

public class Dollar extends Money {
	
	public Dollar(int amount) {
	 	
		this.amount = amount;
		
	} // end Dollar constructor -- int
	
	public Dollar times(int multiplier) {
		
		return new Dollar(amount * multiplier);
		
	} // end times method
	
} // end Dollar class