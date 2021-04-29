package com.zdx;

import java.util.Scanner;

public class Swap {
	public static int a,b;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		swap();
		System.out.println(a + " " + b);
	}

	private static void swap() {
		int temp;
		temp = a;
		a = b;
		b = temp;
	}
}
