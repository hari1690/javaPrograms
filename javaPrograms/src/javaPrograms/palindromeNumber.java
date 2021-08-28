package javaPrograms;

public class palindromeNumber {

	public static void main(String[] args) {
		// check palindrome or not
		
		int num = 122;
		int rev =0;
		
		int actualnum=num;
		
		while(num!=0) {
			int n = num%10; //1
			rev = rev*10+n;
			num = num/10;
		}
		
		System.out.println(rev);
		
		if(actualnum ==rev) {
			System.out.println("palindrome number");
		}
		else {
			System.out.println("Not a plaindrome number");
		}

	}

}
