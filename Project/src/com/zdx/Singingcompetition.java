package com.zdx;

import java.util.Scanner;

public class Singingcompetition {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] arr = new int[n][4];
		double[] sum = new double[n];
		for(int i = 0;i < n;i++)
			for(int j = 0;j < 4;j++) 
				arr[i][j] = scanner.nextInt();
		for(int i = 0;i < n;i++) {
			sum[i] = (double) (arr[i][0] * 0.7 + arr[i][1] * 0.2 + arr[i][2] * 0.1 + arr[i][3]);
			if(sum[i] > 100)
				sum[i] = 100;
		}
		for(double i : sum) {
			System.out.printf("%.1f",i);
			System.out.println();
		}	
	}
}
