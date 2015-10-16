package com.anderson.money;

public interface Expression {
	
	Money reduce(Bank bank, String to);
	
} // end Expression interface