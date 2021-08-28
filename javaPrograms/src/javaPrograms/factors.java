package javaPrograms;

public class factors {

	public static void main(String[] args) {
		// Factors > 10 --  1 2 5 10
		
		// 10/1 = 10, 10/2 
		
		int number = 60;
		
		for(int i=1; i<=number; i++) {
			if(number%i == 0) {
				System.out.println(i);
			}
		}
		
		

	}

}
