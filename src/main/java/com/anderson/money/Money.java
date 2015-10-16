package com.anderson.money;

public class Money implements Expression {

	protected int amount;
	protected String currency;
	
	public Money(int amount, String currency) {
		
		this.amount = amount;
		this.currency = currency;
		
	} // end Money constructor -- int, String
	
	public static Money dollar(int amount) {
		
		return new Money(amount, "USD");
		
	} // end dollar factory method
	
	public static Money franc(int amount) {
		
		return new Money(amount, "CHF");
		
	} // end franc factory method
	
	public Money times(int multiplier) {
		
		return new Money(amount * multiplier, currency);
		
	} // end times method
	
	public Expression plus(Money addend) {
		
		return new Sum(this, addend);
		
	} // end plus method

	public Money reduce(Bank bank, String to) {
		
		int rate = bank.rate(currency, to);
		
		return new Money(amount / rate, to);

	} // end reduce method
	
	public String currency() {
		
		return currency;
		
	} // end currency method
	
	@Override
	public boolean equals(Object o) {

		Money money = (Money) o;
		
		return money.amount == this.amount
				&& currency().equals(money.currency());
		
	} // end equals method
	
	@Override
	public String toString() {
		
		return String.format("%d %s", amount, currency);
		
	} // end toString method
	
} // end Money class