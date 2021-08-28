package javaPrograms;

import java.util.Scanner;

public class oddEvenCheck {

	public static void main(String[] args) {
		// check odd or even number
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number to check whether the number is Even or Odd");
		int number = reader.nextInt();
		if(number==0) {
			System.out.println("Number 0 is not allowed");
		}
		else if(number%2==0) {
			System.out.println("the given number "+number+" is Even");
		}else {
			System.out.println("the given number "+number+" is Odd");
		}

	}

}
