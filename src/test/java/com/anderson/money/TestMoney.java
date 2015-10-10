package com.anderson.money;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestMoney {

	@Test
	public void testEquals() {
		
		Money fiveDollars = new Dollar(5);
		Money sixFrancs = new Franc(6);
		
		assertEquals("five dollars must be equals an object " + 
				"Dollar initialized with amount 5", 
				new Dollar(5), fiveDollars);
		
		assertEquals("six francs must be equals an object " + 
				"Franc initialized with amount 6", 
				new Franc(6), sixFrancs);
		
		assertNotEquals("five dollars must not be equals an object " + 
				"Dollar initialized with amount 6", 
				new Dollar(6), fiveDollars);
		
		assertNotEquals("six francs must not be equals an object " + 
				"Franc initialized with amount 4", 
				new Franc(4), sixFrancs);
		
		assertNotEquals("Dollars must not be equals francs", 
				new Franc(5), fiveDollars);
		
	} // end testEquals method
	
} // end TestMoney class