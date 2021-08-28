package javaPrograms;

public class swapTwoNumbers {

	public static void main(String[] args) {
		// swap two numbers with temp variables
		
		int a = 20;
		int b = 40;
		
		int c = a;
		a = b;
		b=c;
		
		System.out.println(a);
		System.out.println(b);
		
		//swap two numbers without temp variables
		
		int first = 20;
		int second = 40;
		
		first = first-second;
		second = first+second;
		first = second-first;
		
		System.out.println(first);
		System.out.println(second);
		
		

	}

}
