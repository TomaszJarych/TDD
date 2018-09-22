package pl.coderslab.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pl.coderslab.Circle;

public class CircleTest {
	
	private Circle circle;
	
	@Before
	public void setUp() {
		this.circle = new Circle();
		
	}

	@Test
	public void returnShouldNotBeEmpty() {
		//given
		
		double r = 5;
		
		//when
		assertNotNull(circle.circleArea(r));
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void givenRadiusShouldBeGreaterThanZero() {
		
		double r = -5.0;
		circle.circleArea(r);
	}
	
	@Test
	public void testCirceRadius() {
		//given
		double r = 2.0;
		
//		double expectedValue = 0.0
		
	}
	
	
	
	

}
