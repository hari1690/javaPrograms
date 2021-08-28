package javaPrograms;

public class primeNumberCheck {

	public static void main(String[] args) {
		// Check Prime number

		int number = 7;

		boolean flag = false;

		if (number == 0 || number == 1) {
			flag = true;

		} else {

			for (int i = 2; i <= number / 2; i++) {

				if (number % i == 0) {
					flag = true;
					break;
				}
			}
		}
		if (!flag) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}

	}

}
