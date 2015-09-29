package example.others;

import java.util.Arrays;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class CalculatorTestParameterized {

	@Parameters(name = "{index}: multiply[{1}, {2}] = {0}")
	public static Iterable<Double[]> getParameters() {
		
		return Arrays.asList(new Double[][] { {6.0, 2.0, 3.0}, 
				{12.0, 4.0, 3.0}, {1.0, -1.0, -1.0} });
		
	} // end getParameters method
	
	private double expected;
	private double valueOne;
	private double valueTwo;
	
	public CalculatorTestParameterized(double expected, double valueOne,
			double valueTwo) {
		
		this.expected = expected;
		this.valueOne = valueOne;
		this.valueTwo = valueTwo;
		
	} // end CalculatorTestParameterized constructor -- double, double, double
	
	@Test
	public void testMultiply() {
		
		Calculator calc = new Calculator();
		
		assertEquals(expected, calc.multiply(valueOne, valueTwo), 0.0);
		
	} // end testMultiply method
	
} // end CalculatorTestParameterized class