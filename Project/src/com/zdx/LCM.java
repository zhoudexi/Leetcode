package com.zdx;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(lcm(a,b));
	}

	private static int lcm(int a, int b) {
		return a * b / gcd(a,b);
	}

	private static int gcd(int a, int b) {
		return a % b == 0 ? b : gcd(b, a % b);
	}
}
