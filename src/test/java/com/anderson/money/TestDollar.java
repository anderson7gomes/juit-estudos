package com.anderson.money;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class TestDollar {

	@Test
	public void testTimes() {
		
		Dollar five = new Dollar(5);
		
		Dollar product = five.times(2);
		
		Dollar product2 = five.times(3);
		
		assertTrue("Objeto five foi alterado", 5 == five.amount);
		
		assertEquals("amount de product deve ser igual ao " + 
				"amount de five vezes 2", 10, product.amount);
		
		assertEquals("amount de product2 dever ser igual ao " +
				"amount de five vezes 3", 15, product2.amount);
		
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