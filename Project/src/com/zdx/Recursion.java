package com.zdx;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[(n+"").length()];
		for(int i = arr.length - 1;i >= 0;i--) {
			arr[i] = n % 10;
			n /= 10;
		}
		for(int i:arr)
			System.out.print(i+"-");
	}
}
