package com.zdx;

import java.util.Scanner;

public class Powerfunction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.println(power(x,y));
	}

	private static int power(int x, int y) {
		int sum = 1;
		for(int i = 1;i <= y;i++)
			sum *= x;
		return sum;
	}

}
