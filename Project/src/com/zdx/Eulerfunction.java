package com.zdx;

import java.util.Scanner;

public class Eulerfunction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long ans = n;
		for(int i = 2;i * i <= n;i++) {
			if(n % i == 0) {
				ans = ans / i * (i - 1);
				while(n % i == 0)
					n /= i;
			}
		}
		if(n > 1)
			System.out.println(ans / n * (n - 1));
		else
			System.out.println(n);
	}
}
