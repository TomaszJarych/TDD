package pl.coderslab.Homework;

public class Nwd {

	public int nwd(int a, int b) {
		int nwd = 1;

		if (a < 0) {
			a = a * -1;
		}
		if (b < 0) {
			b = b * -1;
		}

		int largerInt = Math.max(a, b);
		int lesserInt = Math.min(a, b);
		if ((largerInt == a && b == 0) || largerInt == b && a == 0) {
			throw new ArithmeticException();
		}
		for (int i = lesserInt; i >= 1; i--) {
			if (checkNwd(a, b, i)) {
				return i;
			}
			lesserInt--;
		}
		return nwd;
	}

	private boolean checkNwd(int a, int b, int temp) {
		return a % temp == 0 && b % temp == 0;
	}
	
	public static void main(String[] args) {
		Nwd ndw = new Nwd();
		
		int nwd = ndw.nwd(-12, -9);
		System.out.println(nwd);
	}

}

// #### Zadanie 1
//
// 1. Napisz klasę `NWD`, która będzie zawierała metodę `int nwd(int a, int b)`
// -
// metoda ma obliczać największy wspólny dzielnik dwóch liczb. Możesz
// wykorzystać implementację utworzoną w ramach `preworku`.
// 2. Utwórz klasę `NWDTest`, która będzie implementowała testy dla tej klasy.
