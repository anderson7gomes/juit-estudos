package com.anderson.money;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class TestFranc {

	@Test
	public void testTimes() {
		
		Money five = Money.franc(5);
		
		Money product = Money.franc(5).times(2);
		
		Money product2 = Money.franc(5).times(3);
		
		assertTrue("Objeto five foi alterado", 
				Money.franc(5).equals(five));
		
		assertEquals("amount de product deve ser igual ao " + 
				"amount de five vezes 2", Money.franc(10), product);
		
		assertEquals("amount de product2 dever ser igual ao " +
				"amount de five vezes 3", Money.franc(15), product2);
		
	} // end testTimes method
	
} // end TestFranc class