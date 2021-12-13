package com.bl.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {
	static void getFibonacci(int n) {
		int i, n1 = 0, n2 = 1, n3;
		System.out.print(n1 + " " + n2 + " ");
		for (i = 2; i <= n; i++) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int numberLimit = scanner.nextInt();
		getFibonacci(numberLimit);
	}
}