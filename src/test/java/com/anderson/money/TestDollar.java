package com.anderson.money;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class TestDollar {

	@Test
	public void testTimes() {
		
		Dollar product = (Dollar) Money.dollar(5).times(2);
		
		Dollar product2 = (Dollar) Money.dollar(5).times(3);
		
		assertTrue("Objeto five foi alterado", 
				new Dollar(5).equals(Money.dollar(5)));
		
		assertEquals("amount de product deve ser igual ao " + 
				"amount de five vezes 2", new Dollar(10), product);
		
		assertEquals("amount de product2 dever ser igual ao " +
				"amount de five vezes 3", new Dollar(15), product2);
		
	} // end testTimes method
	
	@Test
	public void testEquals() {
		
		Dollar five = new Dollar(5);
		
		assertEquals("Para dois objetos Dollar serem iguais, " + 
				"ambos têm que ter o mesmo valor amount",
				new Dollar(5), five);
		
		assertNotEquals("Para dois objetos Dollar serem diferentes, " + 
				"ambos não podem ter o mesmo valor amount",
				new Dollar(6), five);
		
	} // end testEquals method
	
} // end TestDollar class