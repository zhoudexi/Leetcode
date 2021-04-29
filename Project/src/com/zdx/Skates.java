package com.zdx;

import java.util.Scanner;

public class Skates {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		scanner.close();
		System.out.println(f(m,n));
	}

	private static int f(int m, int n) {
		if(m<n)
			return 0;
		if(n == 0)
			return 1;
		return f(m-1,n)+f(m,n-1);
	}

}
