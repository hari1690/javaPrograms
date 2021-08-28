package javaPrograms;

public class largestAmongThreeNumbers {

	public static void main(String[] args) {
		// find the largest among three numbers

		int a = 40;
		int b = 50;
		int c = 50;

		if (a > b && a > c) {
			System.out.println("a is the greatest");
		} else if (b > a && b > c) {
			System.out.println("b is the greatest");

		} else if (c > a && c > b) {
			System.out.println("C is the gfreatest");
		} else if (a >= b && a > c) {
			System.out.println("A and B are of higher value but equal");
		} else if (b >= c && b > a) {
			System.out.println("B and C are of higher value but equal");
		} else if (c >= a && c > b) {
			System.out.println("A and C are of higher value but equal");
		} else {
			System.out.println("A B C are equal");
		}

	}

}
