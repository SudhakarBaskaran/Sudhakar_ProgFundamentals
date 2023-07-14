package com.gradedproject.q2;

import java.util.Scanner;

public class BasePower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base number X: ");
		int base = sc.nextInt();
		System.out.print("Enter the power N = ");
		int power = sc.nextInt();
		int result = power(base, power);
		System.out.print("X power N is: " + result);
		sc.close();
	}

	static int power(int base, int power) {
		if (power == 0)
			return 1;
		else
			return base * power(base, power - 1);
	}

}
