package javaPrograms;

public class countNumberOfDigitsInteger {

	public static void main(String[] args) {
		// count the number of digits in an integer
		
		int num = 1234567;
		String number = Integer.toString(num);
		
		int numberOfDigits = number.length();
		System.out.println("Number of the digits in the given number is "+numberOfDigits);

	}

}
