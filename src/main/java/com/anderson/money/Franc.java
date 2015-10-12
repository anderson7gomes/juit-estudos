package com.anderson.money;

public class Franc extends Money {
	
	public Franc(int amount, String currency) {
	 	
		super(amount, currency);
		
	} // end Franc constructor -- int
	
	public Money times(int multiplier) {
		
		return Money.franc(amount * multiplier);
		
	} // end times method
	
} // end Franc class