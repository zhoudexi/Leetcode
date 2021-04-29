package com.zdx;

import java.util.Scanner;

public class DPAction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for(int i = 0;i < n;i++)
			a[i] = scanner.nextInt();
		int[][] dp = new int[n+1][2];
		dp[1][0] = a[0];
		for(int i = 2;i <= n;i++) {
			dp[i][0] = Math.min(dp[i-1][0], dp[i-1][1])+a[i-1];
			dp[i][1] = Math.min(dp[i-1][0], dp[i-2][0]);
		}
		System.out.println(Math.min(dp[n][0], dp[n][1]));
	}

}
