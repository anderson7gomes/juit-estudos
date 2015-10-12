package com.anderson.money;

public class Franc extends Money {
	
	public Franc(int amount) {
	 	
		this.amount = amount;
		
	} // end Franc constructor -- int
	
	public Money times(int multiplier) {
		
		return Money.franc(amount * multiplier);
		
	} // end times method
	
} // end Franc class