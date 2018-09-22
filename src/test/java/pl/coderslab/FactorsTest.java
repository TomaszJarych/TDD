package pl.coderslab;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FactorsTest {

	@Test
	public void shouldFactorsRetunrNotBeNull() {
		// given

		int n = 120;

		// when
		List<Integer> factors = Factors.generatePrimeFactors(n);

		// then
		assertNotNull(factors);
	}

	@Test
	public void shouldBeMinimumOneItemInList() {

		// given
		int n = 3;
		int expectedSize = 1;

		// when
		List<Integer> result = Factors.generatePrimeFactors(n);

		assertTrue(result.size() >= expectedSize);
	}

	@Test
	public void shouldFactorsReturnSortedArray() {
		// given

		int n = 10;
		List<Integer> expectedFactors = Arrays.asList(1, 2, 5, 10);
		// when
		List<Integer> resultFactors = Factors.generatePrimeFactors(n);

		// then
		assertEquals(expectedFactors.size(), resultFactors.size());
//
//		assertEquals(expectedFactors.get(0), resultFactors.get(0));
//		assertEquals(expectedFactors.get(1), resultFactors.get(1));
//		assertEquals(expectedFactors.get(2), resultFactors.get(2));
//		assertEquals(expectedFactors.get(3), resultFactors.get(3));
		
		for (int i = 0; i < expectedFactors.size(); i++) {
			assertEquals(expectedFactors.get(i), resultFactors.get(i));
		}
	}

}
