package javaPrograms;

public class armstrongNumberBetweenIntervals {

	public static void main(String[] args) {
		// Armstrong number between two numbers
		
		int low = 101;
		int high = 400;
		
		for (int i = low; i<high; i++){
	         int check, rem, sum = 0;
	         check = i;
	         while(check != 0) {
	            rem = check % 10;
	            sum = sum + (rem * rem * rem);
	            check = check / 10;
	         }
	         if(sum == i){
	            System.out.println(""+i+" is an Armstrong number.");
	         }
	      }
	   }
	

}
