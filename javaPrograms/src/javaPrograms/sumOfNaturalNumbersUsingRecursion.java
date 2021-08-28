package javaPrograms;

public class sumOfNaturalNumbersUsingRecursion{

	public static void main(String[] args) {
		//sum of natural numbers using recursion
		
		int num = 20;
		System.out.println(addNum(num));
		

	}
	
	public static int addNum(int num) {
		
		if(num!=0) {
			return num + addNum(num-1); //1st iteration 20+(20-1) 2nd iteration 19+(19-1)
		}
		else {
			
			return num;
		}
		
	}

}
