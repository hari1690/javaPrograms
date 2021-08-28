package javaPrograms;

public class reverseNumber {

	public static void main(String[] args) {
		// Reverse the number
		
		int number = 1234;
		int reverse = 0;
		
		
		     /*   1234%10 = 4
				reverse = 0*10+4 =4
				1234/10 = 123
				123%10 =3
				reverse = 4*10+3 =43
				number =123/10 = 12
		*/
		while(number != 0) {
			
			int n = number%10; //4
			reverse =reverse*10 + n; //4
			number =number/10; //123
		}
		
		System.out.println("reverse number is "+reverse);
	
	}

}
