package com.zdx;

import java.util.Scanner;

public class Fastexponentiationmodulus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		long c = scanner.nextLong();
		scanner.close();
		long res = power(a,b,c);
		System.out.println(res);
	}

	private static long power(long a, long b, long c) {
		long res = 1 % c;
		while(b > 0) {
			if((b % 1) == 1)
				res = (res * a) % c;
			a = (a * a) % c;
			b >>= 1;
		}
		return res;
	}

}
