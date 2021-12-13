package com.bl.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		int i, sumOfFactors = 0;
		for (i = 1; i < number; i++) {
			if (number % i == 0)
				sumOfFactors += i;
		}

		if (sumOfFactors == number)
			System.out.println(number + " is a Perfect Number");
		else
			System.out.println(number + " is not a Perfect Number");
	}
}