package com.zdx;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[3];
		int max = a[0];
		int index = 0;
		for(int i = 0;i < 3;i++) {
			a[i] = scanner.nextInt();
			if(a[i] > max) {
				max = a[i];
				index = i;
			}
		}
		scanner.close();
		System.out.println(max);
	}
}
