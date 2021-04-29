package com.zdx;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		int sum = 0;
		for(int i = 1;i <= x;i++)
			sum += i;
		System.out.println(sum);
	}
}
