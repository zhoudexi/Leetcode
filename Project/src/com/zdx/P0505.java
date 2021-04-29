package com.zdx;

import java.util.Scanner;

public class P0505 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long a = fac(n);
		while(a % 10 == 0) {
			a /= 10;
		}
		System.out.println( a % 10);
	}

	private static long fac(long n) {
		if(n <= 1)
			return 1;
		else
			return n * fac(n - 1);
	}

}
