package javaPrograms;

public class factorial {

	public static void main(String[] args) {
		// factorial n*n-1

		factorialLogic(10);

		

	}

	public static void factorialLogic(int num) {

		int factorial = 1;

		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
			System.out.println(factorial);
		}

		System.out.println("Final number " + factorial);
	}

}
