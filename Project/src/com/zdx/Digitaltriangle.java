package com.zdx;

import java.util.Scanner;

public class Digitaltriangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] a = new int[n+1][((1+n)*n)/2+1];
		for(int i=1 ; i<=n ; i++)
			for(int j=1 ; j<=i ; j++)
				a[i][j] = scanner.nextInt();
		for(int i=n ; i>=1 ; i--)
			for(int j=1 ; j<=i-1 ; j++)
				a[i-1][j] += Math.max(a[i][j], a[i][j+1]);
		System.out.println(a[1][1]);
	}
}
