package javaPrograms;

public class sumOfNaturalNumbers {

	public static void main(String[] args) {
		// Sum of natural numbers
		// 1+2+3+...+100
		int num = 100;
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("Sum is " + sum);
	}

}
