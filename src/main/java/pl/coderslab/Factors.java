package pl.coderslab;

import java.util.LinkedList;
import java.util.List;

public class Factors {

	public static List<Integer> generatePrimeFactors(int n) {
		List<Integer> list = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				list.add(i);
			}
		}
		return list;
	}

}
