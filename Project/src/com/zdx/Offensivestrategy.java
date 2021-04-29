package com.zdx;

import java.util.Scanner;

public class Offensivestrategy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] w = new int[m];
		int[] p = new int[m];
		int[] q = new int[n];
		int[] dp = new int[200005];	//每个防御值所需的最少资源
		int maxq = 0;			//最大防御值
		int maxt = 0;
		for(int i = 0;i < m;i++)
			w[i] = scanner.nextInt();
		for(int i = 0;i < m;i++)
			p[i] = scanner.nextInt();
		for(int i = 0;i < n;i++) {
			q[i] = scanner.nextInt();
			maxq = Math.max(maxq, q[i]);
		}
		scanner.close();
		dp[0] = 0;
		for(int i = 0;i < m;i++)
			for(int j = 1;j <= maxq;j++) {
				if(i == 0) {
					if(j <= p[i])
						dp[j] = w[i];
					else
						dp[j] = dp[j - p[i]] + w[i];
				}else {
					if(j <= p[i])
						dp[j] = Math.min(dp[j], w[i]);
					else
						dp[j] = Math.min(dp[j], dp[j - p[i]] + w[i]);
				}
			}
		int t,cost;
		for(int i = 0;i < n;i++) {
			t = 0;	//攻破的行数
			cost = k;
			int j = i;
			while(cost>=0&&j<n) {
				cost -= dp[q[j]];
				t++;
				j++;
			}
			maxt = Math.max(maxt, t);
			if(maxt > n - i)
				break;
		}
		System.out.println(maxt);
	}

}
