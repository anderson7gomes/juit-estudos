package com.anderson.money;

public class Franc extends Money {
	
	public Franc(int amount) {
	 	
		this.amount = amount;
		
	} // end Franc constructor -- int
	
	public Franc times(int multiplier) {
		
		return new Franc(amount * multiplier);
		
	} // end times method
	
} // end Franc class