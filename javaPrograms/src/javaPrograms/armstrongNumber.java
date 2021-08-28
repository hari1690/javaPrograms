package javaPrograms;

public class armstrongNumber {

	public static void main(String[] args) {
		// Armstrong number
		// 153 ==> 1*1*1 + 5*5*5 + 3*3*3 = 153
		
		int num =371;
		double result = 0;
		
		int actualNum =num;
		
		while(num != 0) {
			
			int n = num% 10;
			result = result + Math.pow(n, 3);
			num = num/10;
		}
		
		if(result == actualNum) {
			System.out.println("Armstrong Number it is!");
		}else {
			System.out.println("Not an armstrong number");
		}

	}

}
