package com.zdx;

import java.util.Scanner;

public class GraphLongestpath {
	static int max = Integer.MIN_VALUE,r,c;
	static int[][] p = {{1,0},{0,1},{-1,0},{0,-1}};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		r = scanner.nextInt();
		c = scanner.nextInt();
		int[][] a = new int[r][c];
		for(int i = 0;i < r;i++)
			for(int j = 0;j < c;j++)
				a[i][j] = scanner.nextInt();
		scanner.close();
		for(int i = 0;i < r;i++)
			for(int j = 0;j < c;j++)
				dfs(a,i,j,1);
		System.out.println(max);
	}

	private static void dfs(int[][] a, int i, int j, int sum) {
		int t,x,y;
		if(sum>max)
			max = sum;
		for(t = 0;t < 4;t++) {
			x = i + p[t][0];
			y = j + p[t][1];
			if(x >= 0 && x < r && y >= 0 && y < c && a[x][y] < a[i][j]) {
				sum++;
				dfs(a,x,y,sum);
				sum--;
			}
		}
		
	}
}
