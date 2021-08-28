package javaPrograms;

import java.util.Scanner;

public class addTwoIntegers {

	// add two integers entered by the user

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		System.out.println("Please enter the first number");
		int input = reader.nextInt();
		System.out.println("Please enter the next number");
		int inputtwo = reader.nextInt();
		int output = input+inputtwo;
		System.out.println("Result after adding given two numbers is "+output);

	}
}
