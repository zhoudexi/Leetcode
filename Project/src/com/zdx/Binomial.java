package com.zdx;

import java.util.Scanner;

public class Binomial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int n = scanner.nextInt();
		System.out.println(fac(k,n));
	}

	private static int fac(int k, int n) {
		if(k == 0 || k == n)
			return 1;
		else
			return fac(k,n-1)+fac(k-1,n-1);
	}
}
