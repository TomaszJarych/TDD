package pl.coderslab.Homework;

public class YearUtils {

	public boolean isYearLeap(int year) {
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

		return isLeapYear;
	}

}
