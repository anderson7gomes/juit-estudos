package com.anderson.money;

public class Dollar extends Money {
	
	public Dollar(int amount, String currency) {
	 	
		super(amount, currency);
		
	} // end Dollar constructor -- int
	
	public Money times(int multiplier) {
		
		return Money.dollar(amount * multiplier);
		
	} // end times method
	
} // end Dollar class