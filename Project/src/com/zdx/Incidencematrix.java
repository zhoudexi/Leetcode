package com.zdx;

import java.util.Scanner;

public class Incidencematrix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] graph = new int[n][m];
		int a,b;
		for(int i = 0;i < m;i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			graph[a-1][i] = 1;
			graph[b-1][i] = -1;
		}
		for(int i = 0;i < n;i++) {
			for(int j = 0; j < m;j++)
				System.out.print(graph[i][j] + " ");
			System.out.println();
		}
	}
}
