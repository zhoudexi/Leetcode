package com.zdx;

import java.util.Scanner;

public class Matrixmultiplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int s = scanner.nextInt();
		int n = scanner.nextInt();
		int[][] a = new int[m][s];
		int[][] b = new int[s][n];
		int[][] c = new int[m][n];
		for(int i = 0;i < m;i++)
			for(int j = 0;j < s;j++)
				a[i][j] = scanner.nextInt();
		for(int i = 0;i < s;i++)
			for(int j = 0;j < n;j++)
				b[i][j] = scanner.nextInt();
		scanner.close();
		for(int i = 0;i < m;i++)
			for(int j = 0;j < n;j++)
				for(int l = 0;l < s;l++)
					c[i][j] += a[i][l]*b[l][j];
		for(int i = 0;i < m;i++) {
			for(int j = 0;j < n;j++)
				System.out.print(c[i][j]+" ");
			System.out.println();
		}		
	}
}
