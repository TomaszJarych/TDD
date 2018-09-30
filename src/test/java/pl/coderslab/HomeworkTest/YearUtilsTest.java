package pl.coderslab.HomeworkTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import pl.coderslab.Homework.YearUtils;

public class YearUtilsTest {
	
	private YearUtils yearUtils;
	
	@Before
	public void setUp() {
		this.yearUtils = new  YearUtils();
	}
	
	@Test
	public void shouldCheckIfGivenYearsIsLeap() {
		
		//given 
		int givenYear = 1984;
		int givenYear2 = 2200;
		
		//when
		boolean actual = yearUtils.isYearLeap(givenYear);
		boolean actual2 = yearUtils.isYearLeap(givenYear2);
		//then
		assertTrue(actual);
		assertFalse(actual2);
		
	}


}
