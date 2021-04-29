package com.zdx;

import java.util.Scanner;

public class Probability {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double p = scanner.nextDouble();
		int k = scanner.nextInt();
		double sum = 0;
		for(int i = 0;i <= k - 1;i++)
			sum += probability(p,i);
		sum += k * Math.pow(1 - p,k - 1);
		System.out.printf("%.2f",sum);
	}

	private static double probability(double p, int i) {
		return i * Math.pow(1-p, i - 1) * p;
	}
}
