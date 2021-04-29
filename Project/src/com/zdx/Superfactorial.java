package com.zdx;

import java.util.Scanner;

public class Superfactorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		long sum = 1;
		int count = 0;
		for(int i = 0;i < n;i++) {
			sum = sum * (1 + i * k);
			while(sum % 10 == 0) {
				count++;
				sum /= 10;
			}
			sum %= 100000;
		}
		System.out.println(count);
		System.out.println(sum % 10);
	}
}
