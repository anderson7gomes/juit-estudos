package com.anderson.money;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestMoney {

	@Test
	public void testEquals() {
		
		Money fiveDollars = Money.dollar(5);
		Money sixFrancs = Money.franc(6);
		
		assertEquals("five dollars must be equals an object " + 
				"Dollar initialized with amount 5", 
				Money.dollar(5), fiveDollars);
		
		assertEquals("six francs must be equals an object " + 
				"Franc initialized with amount 6", 
				Money.franc(6), sixFrancs);
		
		assertNotEquals("five dollars must not be equals an object " + 
				"Dollar initialized with amount 6", 
				Money.dollar(6), fiveDollars);
		
		assertNotEquals("six francs must not be equals an object " + 
				"Franc initialized with amount 4", 
				Money.franc(4), sixFrancs);
		
		assertNotEquals("Dollars must not be equals francs", 
				Money.franc(5), fiveDollars);
		
	} // end testEquals method
	
	@Test
	public void testCurrency() {
		
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
		
	} // end testCurrency method
	
} // end TestMoney class