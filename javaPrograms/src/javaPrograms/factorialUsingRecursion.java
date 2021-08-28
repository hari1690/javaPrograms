package javaPrograms;

public class factorialUsingRecursion {

	public static void main(String[] args) {
		// 

		System.out.println(factorial(5));
		
	}
	
	public static double factorial(double num) {
		if(num>=1) {
			return num*factorial(num-1);
		}
		else {
			return 1;
		}
	}

}
