package javaPrograms;

import java.util.Scanner;

public class multiplyTwoFloatingNumbers {

	public static void main(String[] args) {
		// Multiply two floating point numbers
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		System.out.println("Please enter the first number");
		float input = reader.nextFloat();
		System.out.println("Please enter the next number");
		float inputtwo = reader.nextFloat();
		float output = input*inputtwo;
		System.out.println("Result after adding given two numbers is "+output);

		

	}

}
