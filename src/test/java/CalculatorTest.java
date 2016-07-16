package test.java;

//Imports
import static org.junit.Assert.*;
import org.junit.*;

import com.java.calculator.Calculator;
import com.java.calculator.ICalculator;

public class CalculatorTest {

	private static ICalculator calculator;

	// This is required to instantiate the calculator object from our Calculator
	// class.
	@BeforeClass
	public static void initCalculator() {
		calculator = new Calculator();
	}

	// Test for equality using the sum method within the Calculator.java.
	// assertEquals is checking to ensure the result returned from the sum function is equal to 8
	@Test
	public void testSum() {
		int result = calculator.sum(4, 4);

		assertEquals(8, result);
	}
	

	// Test for equality using the multiplication method within the Calculator.java.
	// assertEquals is checking to ensure the result returned from the multiplication function is equal to 4
	@Test
	public void testMultiplication(){
		
		int result = calculator.multiplication(2,2);
		
		assertEquals(4, result);
	}

}
