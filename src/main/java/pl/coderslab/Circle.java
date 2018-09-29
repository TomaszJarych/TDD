package pl.coderslab;

import java.math.BigDecimal;

public class Circle {
	private static final BigDecimal PI = BigDecimal.valueOf(Math.PI).setScale(3,
			BigDecimal.ROUND_HALF_EVEN);


	public Double circleArea(double r) {
		if (r <0) {
			throw new IllegalArgumentException("r can't be l than 0");
			
		}
		BigDecimal parsedR = BigDecimal.valueOf(r).setScale(3,
				BigDecimal.ROUND_HALF_EVEN);
		System.out.println(parsedR);
		System.out.println(PI);
		BigDecimal pr2 = PI.multiply(parsedR.pow(2)).setScale(2,
				BigDecimal.ROUND_HALF_EVEN);

		System.out.println(pr2);
		 return pr2.doubleValue();
	}

}

// #### Zadanie 3
//
// 1. Napisz klasę `Circle` z jedną metodą publiczną ```circleArea(r)```
// zwracającą obliczone pole koła dla promienia `$r`.
// 2. W przypadku podania ujemnej wartości argumentu `r` metoda powinna rzucić
// wyjątek.
// 3. Wynik należy zaokrąglić **w górę** do `2` liczb po przecinku.
//
// Napisz to zadanie, używając w pełni metodologii TDD.
//
// Wykonuj commit po każdy z 3 etapów procesu czyli:
// - po napisaniu testów
// - po napisaniu kodu
// - po refaktoryzacji
