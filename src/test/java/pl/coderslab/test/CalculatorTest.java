package pl.coderslab.test;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.coderslab.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		// given
		int a = 5;
		int b = 3;
		int expected = 8;

		// when
		Calculator calculator = new Calculator();
		int result = calculator.add(a, b);

		// then
		assertEquals(expected, result);
	}

	@Test
	public void testSubtract() {
		// given
		int a = 5;
		int b = 3;
		int expected = 2;

		// when
		Calculator calculator = new Calculator();
		int result = calculator.subtract(a, b);

		// then
		assertEquals(expected, result);

	}

	@Test
	public void testMultiply() {
		// given
		int a = 5;
		int b = 3;
		int expected = 15;

		// when
		Calculator calculator = new Calculator();
		int result = calculator.multiply(a, b);

		// then
		assertEquals(expected, result);

	}

	@Test
	public void testDivide() {
		// given

		int a = 6;
		int b = 3;
		int expected = 2;

		// when
		Calculator calculator = new Calculator();
		int result = calculator.divide(a, b);

		// then
		assertEquals(expected, result);
	}

	@Test
	public void testGreater() {
		// given
		int a = 15;
		int b = 13;

		// when
		Calculator calculator = new Calculator();

		// then
		assertTrue(calculator.greater(a, b));
	}

	@Test
	public void evaluatesExpression() {
		Calculator calculator = new Calculator();
		int sum = calculator.eval("1+2+3");
		assertEquals(6, sum);
	}

}
