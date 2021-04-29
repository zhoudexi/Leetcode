package com.zdx;

import java.util.Scanner;

public class Squares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextInt();
		double x = Math.sqrt(n);
		long res = 0;
		if(n < 0)
			res = 0;
		else if((long)x * (long)x == n)
			res = (long)x;
		else
			res = (long)x + 1;
		System.out.println(res * res);
	}

}
