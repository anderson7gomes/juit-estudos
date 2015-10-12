package com.anderson.money;

public abstract class Money {

	protected int amount;
	protected String currency;
	
	public Money(int amount, String currency) {
		
		this.amount = amount;
		this.currency = currency;
		
	} // end Money constructor -- int, String
	
	public static Dollar dollar(int amount) {
		
		return new Dollar(amount, "USD");
		
	} // end dollar factory method
	
	public static Franc franc(int amount) {
		
		return new Franc(amount, "CHF");
		
	} // end franc factory method
	
	public abstract Money times(int multiplier);
	
	public String currency() {
		
		return currency;
		
	} // end currency method
	
	@Override
	public boolean equals(Object o) {

		Money money = (Money) o;
		
		return money.amount == this.amount
				&& getClass().equals(money.getClass());
		
	} // end equals method
	
} // end Money class