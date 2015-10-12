package com.anderson.money;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class TestDollar {

	@Test
	public void testTimes() {
		
		Money five = Money.dollar(5);
		
		Money product = five.times(2);
		
		Money product2 = five.times(3);
		
		assertTrue("Objeto five foi alterado", 
				Money.dollar(5).equals(five));
		
		assertEquals("amount de product deve ser igual ao " + 
				"amount de five vezes 2", Money.dollar(10), product);
		
		assertEquals("amount de product2 dever ser igual ao " +
				"amount de five vezes 3", Money.dollar(15), product2);
		
	} // end testTimes method
	
} // end TestDollar class