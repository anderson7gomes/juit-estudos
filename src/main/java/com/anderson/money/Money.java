package com.anderson.money;

public abstract class Money {

	protected int amount;
	
	public static Dollar dollar(int amount) {
		
		return new Dollar(amount);
		
	} // end dollar factory method
	
	public static Franc franc(int amount) {
		
		return new Franc(amount);
		
	} // end franc factory method
	
	public abstract Money times(int multiplier);
	
	@Override
	public boolean equals(Object o) {

		Money money = (Money) o;
		
		return money.amount == this.amount
				&& getClass().equals(money.getClass());
		
	} // end equals method
	
} // end Money class