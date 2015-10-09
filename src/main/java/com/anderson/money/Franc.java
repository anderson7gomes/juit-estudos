package com.anderson.money;

public class Franc {

	private int amount;
	
	public Franc(int amount) {
	 	
		this.amount = amount;
		
	} // end Franc constructor -- int
	
	public Franc times(int multiplier) {
		
		return new Franc(amount * multiplier);
		
	} // end times method
	
	@Override
	public boolean equals(Object o) {
		
		Franc franc = (Franc) o;
		
		return franc.amount == this.amount;
		
	} // end equals method
	
} // end Franc class