package com.zdx;

import java.util.Scanner;

public class Integrator {

	public static void main(String[] args) {
		System.out.println("Please enter the dividend:");
		System.out.println("Please enter the divisor:");
		Scanner scanner = new Scanner(System.in);
		int dividend = scanner.nextInt();
		int divisor = scanner.nextInt();
		while(divisor == 0) {
			System.out.println("Error: divisor can not be zero! Please enter a new divisor:");
			divisor = scanner.nextInt();
		}
		System.out.println(dividend/divisor);
	}
}
