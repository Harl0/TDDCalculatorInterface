package com.java.calculator;

// Declaring class which implements our ICalculator interface
public class Calculator implements ICalculator {

	// Override the method sum within the ICalculator interface
	// return the result of a + b back to CalculatorTests.java
	@Override
	public int sum(int a, int b) {
		return a + b;
	}
	
	// Override the method multiplication within the ICalculator interface
	// return the result of a * b back to CalculatorTests.java
	@Override
	public int multiplication(int a, int b) {
		return a * b;
	}

}
