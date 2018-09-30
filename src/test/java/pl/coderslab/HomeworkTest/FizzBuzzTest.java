package pl.coderslab.HomeworkTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.coderslab.Homework.FizzBuzz;

public class FizzBuzzTest {

	@Test(expected = StackOverflowError.class)
	public void givenNumberLesserThanZeroShouldThrowException() {
		// given
		int number = -5;

		// when
		FizzBuzz.fizzBuzz(number);
	}

	@Test
	public void checkWhenGivenNumberIsZeroShouldReturnEmptyString() {
		// given
		int givenNumber = 0;
		String expected = "";
		// when
		String actual = FizzBuzz.fizzBuzz(givenNumber);

		// then
		assertNotNull(actual);
		assertEquals(expected, actual);

	}

	@Test
	public void checkWhenGivenNumberIsDividedByThreeResultIsCorrect() {
		// given
		int givenNumber = 3;
		String expected = "12Fizz";
		// when
		String actual = FizzBuzz.fizzBuzz(givenNumber);

		// then
		assertNotNull(actual);
		assertEquals(expected, actual);
	}

	@Test
	public void checkWhenGivenNumberIsDividedByFiveResultIsCorrect() {
		// given
		int givenNumber = 5;
		String expected = "12Fizz4Buzz";
		// when
		String actual = FizzBuzz.fizzBuzz(givenNumber);

		// then
		assertNotNull(actual);
		assertEquals(expected, actual);
	}

	@Test
	public void whenGivenNumberIsDividedByBothThreeAndFiveShouldGiveCorrecResult() {

		// given
		int givenNumber = 15;
		String expected = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz";
		// when
		String actual = FizzBuzz.fizzBuzz(givenNumber);

		// then
		assertNotNull(actual);
		assertEquals(expected, actual);

	}
}
