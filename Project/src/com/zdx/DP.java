package com.zdx;

import java.util.Scanner;

public class DP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int p = scanner.nextInt();
		int t = scanner.nextInt();
		int[][] dp = new int[1005][1005];
		int[] w = new int[1005];
		for(int i = 1;i <= n;i++)
			w[i] = scanner.nextInt();
		scanner.close();
		for(int i = 1;i <= p && i <= n+1;i++)
			dp[i][1] = w[i];
		for(int j = 2;j <= t;j++)
			for(int i = 1;i <= n+1 && i <= j * p;i++)
				for(int k = 1;k <= p && i - k > 0;k++)
					dp[i][j] = Math.max(dp[i][j], dp[i-k][j-1]+w[i]);
		System.out.println(dp[n+1][t]);
	}
}
