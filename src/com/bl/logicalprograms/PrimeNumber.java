package com.bl.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
	static void checkPrime(int n) {
		int flag = 0, i;
		for (i = 2; i <= (n / 2); i++) {
			if ((n % i) == 0)
				flag = 1;
		}
		if (n == 1)
			System.out.println("1 is neither prime nor composite");
		else if (flag == 0)
			System.out.println(n + " is a prime Number");
		else
			System.out.println(n + " is not a prime Number");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = scanner.nextInt();
		checkPrime(number);
	}
}