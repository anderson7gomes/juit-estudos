package com.anderson.money;

public class Sum implements Expression {

	Money augend;
	Money addend;
	
	public Sum(Money augend, Money addend) {
		
		this.augend = augend;
		this.addend = addend;
		
	} // end Sum constructor -- int, int
	
	public Money reduce(String to) {
		
		int amount = augend.amount + addend.amount;
		
		return new Money(amount, to);
		
	} // end reduce method
	
} // end Sum class