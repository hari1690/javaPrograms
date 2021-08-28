package javaPrograms;

public class generateMultiplicationTables {

	public static void main(String[] args) {
		// Multiplication table
		//2x1=2
		//2x2=4
		
		int num = 2;
	
		for(int i=1;i<=10;i++) {
			int result = num*i;
			System.out.println(num+" x " +i+ " = " + result);
		}
		

	}

}
