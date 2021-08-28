package javaPrograms;

import java.util.Scanner;

public class printIntegers {

	// print the integer entered by the user

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a number");
		int input = reader.nextInt();
		System.out.println("You Entered " + input);

	}
}
