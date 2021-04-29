package com.zdx;

import java.util.Scanner;

public class Additionoperation {

	public static void main(String[] args) {
		GetTwoInts();
	}

	private static void GetTwoInts() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(a+b);
	}

}
