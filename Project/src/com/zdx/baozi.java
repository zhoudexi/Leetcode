package com.zdx;

import java.util.Scanner;

public class baozi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] arr = new double[6];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextDouble();
		}
		int n = scanner.nextInt();
		double time = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = i + 3; j < i + 4; j++) {
				time += (double)(arr[j] / arr[i]);
			}
		}
		System.out.printf("%."+ n + "f",time);
 	}
}
