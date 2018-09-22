package pl.coderslab;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {

		return a * b;
	}

	public int divide(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException();
		}
		return a / b;
	}

	public boolean greater(int a, int b) {
		return a > b;
	}

	public int eval(String input) throws NumberFormatException{
		input = input.replaceAll("\\D", ",");
		String[] inputArray = input.split(",");
		int result = 0;
		for (String string : inputArray) {
			result += Integer.parseInt(string);
		}

		return result;
	}
}

// #### Zadanie 4
//
// 1. Utwórz klasę `Calculator.java`, która będzie implementowała cztery
// działania matematyczne
// * dodawanie
// * odejmowanie
// * mnożenie
// * dzielenie
// * porównanie 2 wartości (boolean greater(int a, int b))
//
// 2. Utwórz klasę `CalculatorTest.java`, która będzie implementowała testy dla
// tej klasy.
