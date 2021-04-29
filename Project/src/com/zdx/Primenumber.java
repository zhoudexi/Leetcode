package com.zdx;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		scanner.close();
		int count = 0;
		int sum = 1;
		for(int i = 2;count < n;i++) {
			if(isPrime(i)) {
				sum *= i;
				sum %= 50000;
				count++;
			}
		}
		System.out.println(sum);
	}

	private static boolean isPrime(int n) {
		if(n == 1)
			return false;
		if(n == 2)
			return true;
		if(n % 2 == 0)
			return false;
		for(int i = 3;i * i <= n;i = i + 2)
			if(n % i == 0)
				return false;
		return true;
	}
}
