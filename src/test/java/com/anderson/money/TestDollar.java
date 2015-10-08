package com.anderson.money;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDollar {

	@Test
	public void testTimes() {
		
		Dollar five = new Dollar(5);
		
		five.times(2);
		
		assertEquals("5 times 2 must be 10 dollars", 
				10, five.amount);
		
	} // end testTimes method
	
} // end TestDollar class