public class CalculatorTest {

	public void testAdd() {
	
		Calculator calc = new Calculator();
		
		double result = calc.add(10.0, 50.0);
		
		if (result != 60.0) {
			throw new IllegalStateException("Bad result: " + result);
		}
		
		System.out.print('.');
	
	} // end testAdd method
	
	public void testMultiply() {
	
		Calculator calc = new Calculator();
		
		double result = calc.multiply(3.0, 4.0);
		
		if (result != 12.0) {
			throw new IllegalStateException("Bad result: " + result);
		}
		
		System.out.print('.');
	
	} // end testMultiply method

	public static void main(String[] args) {
	
		CalculatorTest test = new CalculatorTest();
		
		int numberOfErrors = 0;	
			
		try {
			test.testAdd();
		} catch (Throwable e) {
		
			++numberOfErrors;
			System.out.print('E');

		}
		
		try {
			test.testMultiply();
		} catch (Throwable e) {
		
			++numberOfErrors;
			System.out.print('E');

		}
		
		System.out.printf("\n\nOk <%d errors>\n", numberOfErrors);
	
	} // end main method

} // end CalculatorTest class
