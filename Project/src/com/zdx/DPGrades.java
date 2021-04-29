package com.zdx;

import java.util.Scanner;

public class DPGrades {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] w = new int[n];
		int[][] dp = new int[4][n]; 
		for(int i = 0;i < n;i++)
			w[i] = scanner.nextInt();
		for(int i = 0;i < n;i++) {
			dp[0][i] = 1;
			for(int j = i + 1;j < n;j++) {
				if(w[j] > w[i]) {
					dp[1][j] += dp[0][i];
					dp[2][j] += dp[1][i];
					dp[3][j] += dp[2][i];
				}
			}
		}
		long cout = 0L;
		for(int i = 3;i < n;i++)
			cout += dp[3][i];
		System.out.println(cout);
	}
}
