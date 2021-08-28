package javaPrograms;

import java.util.Scanner;

public class simpleCalculator {

	public static void main(String[] args) {
		// create a simple calculator with 4 major operations using switch case

		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter two numbers: ");
		double first = reader.nextDouble();
		double second = reader.nextDouble();

		System.out.println("Please enter the operation to do: (+, -, *, /)");
		char operator = reader.next().charAt(0);

		double result=0;

		switch (operator) {

		case '+':
			result = first + second;
			break;

		case '-':
			result = first - second;
			break;

		case '*':
			result = first * second;
			break;

		case '/':
			result = first / second;
			break;
			
		default:
			System.out.println("please pass the correct operator");
			break;

		}
		System.out.println("Result is "+ result);
	}

}
