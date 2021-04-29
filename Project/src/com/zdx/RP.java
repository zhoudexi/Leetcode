package com.zdx;

import java.util.Scanner;

public class RP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n > 10) {
			n %= 10;
		}
		System.out.print((int)(Math.pow(n, Math.random())));
	}
}
