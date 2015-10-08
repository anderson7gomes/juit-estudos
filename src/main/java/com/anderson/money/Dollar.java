package com.anderson.money;

public class Dollar {

	public int amount;
	
	public Dollar(int amount) {
	 	
		this.amount = amount;
		
	} // end Dollar constructor -- int
	
	public void times(int multiplier) {
		
		amount *= multiplier;
		
	} // end times method
	
} // end Dollar class