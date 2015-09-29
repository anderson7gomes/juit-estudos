package example.others;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({CalculatorTest.class, EmployeeTest.class})
public class CalculatorAndEmployeeTests {	
} // end CalculatorAndEmployeeTests