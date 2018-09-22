package pl.coderslab.test;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.coderslab.MaxValue;

public class MaxValueTest {
	
	@Test(expected=RuntimeException.class)
	public void testLargestEmptyArray() {
		// given

		int[] list = {};

		// when
		MaxValue maxValue = new MaxValue();
		int result = maxValue.largest(list);

	}
	
	@Test
	public void testLargest() {
		// given

		int[] list = {1, 2, 3, 4, 5};
		int expected = 5;

		// when
		MaxValue maxValue = new MaxValue();
		int result = maxValue.largest(list);

		// test
		assertEquals(expected, result);
	}

}
