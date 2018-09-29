package pl.coderslab.HomeworkTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pl.coderslab.Homework.Nwd;

public class NwdTest {

	private Nwd nwd;

	@Before
	public void SetUp() {
		this.nwd = new Nwd();
	}

	@Test
	public void shuoldReturnLargestCommonDivider() {
		// given
		int a = 12;
		int b = 9;

		int expected = 3;

		// when
		int actual = nwd.nwd(a, b);

		// then
		assertTrue(actual >= 1);
		assertEquals(expected, actual);

	}

}
