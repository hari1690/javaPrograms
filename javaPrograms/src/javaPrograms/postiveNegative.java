package javaPrograms;

public class postiveNegative {

	public static void main(String[] args) {
		// handle any numbers and give away either it is postive or negative
		
		double number = -12.33;
		
		if(number<0.0) {
			System.out.println("Negative number");
			
		}
		else if(number>0.0) {
			System.out.println("Positive number");
		}
		else {
			System.out.println("number is zero");
		}

	}

}
