package com.anderson.money;

public class Dollar {

	public int amount;
	
	public Dollar(int amount) {
	 	
		this.amount = amount;
		
	} // end Dollar constructor -- int
	
	public Dollar times(int multiplier) {
		
		return new Dollar(amount * multiplier);
		
	} // end times method
	
	@Override
	public boolean equals(Object o) {
		
		Dollar dollar = (Dollar) o;
		
		return dollar.amount == this.amount;
		
	} // end equals method
	
} // end Dollar class