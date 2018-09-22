package pl.coderslab.test;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.coderslab.SimpleCalculator;

public class SimpleCalculatorTest {


	@Test(expected= IllegalArgumentException.class)
	public void testAddPositve() {
		//given
		int x =-1;
		int y = -20;
		
		//when
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.addPositve(x, y);
		
		//then
	}

}
