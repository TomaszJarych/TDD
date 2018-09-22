package pl.coderslab.test;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.coderslab.First;

public class FirstTest {

	@Test
	public void testConcatString() {
		// given

		String firstString = "Coders";
		String secondString = "Lab";
		String expected = "CodersLab";

		// when
		First first = new First();
		String result = first.concatString(firstString, secondString);
		
		//then
		assertEquals(expected, result);
		
	}

	@Test
	public void testMultiply() {
		// given
		int a = 6;
		int b = 8;
		int expected = 48;
		
		//when 
		First first = new First();
		int result = first.multiply(a, b);
		
		
		
		//then
		assertEquals(expected, result);
	}

}
