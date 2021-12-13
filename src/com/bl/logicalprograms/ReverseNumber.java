package com.bl.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {
	static int reversDigits(int n) {
		int reverseNumber = 0, remainder;
		while (n > 0) {
			remainder = n % 10;
			reverseNumber = (reverseNumber * 10) + remainder;
			n = n / 10;
		}
		return reverseNumber;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = scanner.nextInt();
		System.out.println("Reverse of number is " + reversDigits(number));
	}
}