package com.zdx;

import java.util.Scanner;

public class Matrixtranspose {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] a = new int[n][m];
		int[][] b = new int[m][n];
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++)
				a[i][j] = scanner.nextInt();
			scanner.nextLine();
		}
		for(int i = 0;i < n;i++)
			for(int j = 0;j < m;j++)
				b[j][i] = a[i][j];
		for(int i = 0;i < m;i++) {
			for(int j = 0;j < n;j++)
				System.out.print(b[i][j]+ " ");
			System.out.println();
		}	
	}
}
