package javaPrograms;

public class primeNumberBetweenTwoIntervals {

	public static void main(String[] args) {
		// Check the prime number between two intervals
		int lowNum = 10;
		int highNum = 20;
		
		
		while(lowNum<highNum) {
			boolean flag= false;
			for(int i=2;i<=highNum/2;i++) {
				
				if(lowNum%i==0) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.println(lowNum + " ");
			}
			lowNum++;
		}

	}

}
