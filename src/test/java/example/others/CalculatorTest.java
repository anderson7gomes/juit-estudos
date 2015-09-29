package example.others;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

	@Test
	public void testAdd() {
		
		Calculator calc = new Calculator();
		
		double result = calc.add(50.0, 10.0);
		
		assertEquals(60.0, result, 0.0);
		
	} // end testAdd method
	
	@Test
	public void testMultiply() {
		
		Calculator calc = new Calculator();
		
		double result = calc.multiply(3.0, 4.0);
		
		assertEquals(12.0, result, 0.0);
		
	} // end testMultiply method
	
} // end CalculatorTest class