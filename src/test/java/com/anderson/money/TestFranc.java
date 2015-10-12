package com.anderson.money;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class TestFranc {

	@Test
	public void testTimes() {
		
		Franc product = (Franc) Money.franc(5).times(2);
		
		Franc product2 = (Franc) Money.franc(5).times(3);
		
		assertTrue("Objeto five foi alterado", 
				new Franc(5).equals(Money.franc(5)));
		
		assertEquals("amount de product deve ser igual ao " + 
				"amount de five vezes 2", new Franc(10), product);
		
		assertEquals("amount de product2 dever ser igual ao " +
				"amount de five vezes 3", new Franc(15), product2);
		
	} // end testTimes method
	
	@Test
	public void testEquals() {
		
		Franc five = new Franc(5);
		
		assertEquals("Para dois objetos Franc serem iguais, " + 
				"ambos têm que ter o mesmo valor amount",
				new Franc(5), five);
		
		assertNotEquals("Para dois objetos Franc serem diferentes, " + 
				"ambos não podem ter o mesmo valor amount",
				new Franc(6), five);
		
	} // end testEquals method
	
} // end TestFranc class