package javaPrograms;

public class fibonacciSeries {

	public static void main(String[] args) {
		// fibonacci series
		// 0 1 1 2 3 5 8 13 21
		
		int num = 10;
		int fibonacci = 0;
		int t1= 0;
		int t2= 1;
		
		System.out.println(t1);
		System.out.println(t2);
		  
		for(int i=1; i<=num;i++) {
			
			int t3 = t1+t2;
			t1=t2;
			t2=t3;
			System.out.println(t3);
			
			
		}
		
		
		

	}

}
