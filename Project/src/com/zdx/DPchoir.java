package com.zdx;

import java.util.Scanner;

public class DPchoir {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		int[] dp1 = new int[105];
		int[] dp2 = new int[105];
		for(int i = 0;i < n;i++)
			a[i] = scanner.nextInt();
		scanner.close();
		dp1[0] = 0;
		dp2[n-1] = 0;
		for(int i = 0;i < n;i++)
			for(int j = 0;j < i;j++) {
				if(a[j] < a[i])
					dp1[i] = Math.max(dp1[i],dp1[j]+1);
			}
		for(int i = n - 1;i >= 0;i--)
			for(int k = i + 1;k < n;k++) {
				if(a[k] < a[i]) 
					dp2[i] = Math.max(dp2[i], dp2[k] + 1);
			}
		int max = -1;
		for(int i = 0;i < n;i++)
			max = Math.max(max,dp1[i] + dp2[i]);
		max++;
		System.out.println(n-max);
	}

}
