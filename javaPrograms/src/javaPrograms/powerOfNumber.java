package javaPrograms;

public class powerOfNumber {

	public static void main(String[] args) {
		// Calculate the power of number
		
		//3^4 = 81
		
		int base = 3;
		int exponent = 4;
		
		long result=1;
		
		while(exponent != 0) {
			result = result*base;
			--exponent;
		}
		System.out.println(result);
		
		System.out.println(Math.pow(3, 4));

	}

}
