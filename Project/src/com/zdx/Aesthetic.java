package com.zdx;

import java.util.Scanner;

public class Aesthetic {

	public static void main(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] arr = new int[n][m];
		int[] tmp = new int[m];
		for(int i = 0;i < n;i++) 
			for(int j = 0;j < m;j++)
				arr[i][j] = scanner.nextInt();
		scanner.close();
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				tmp[j] = arr[i][j];
				
			}
		}
	}

}
