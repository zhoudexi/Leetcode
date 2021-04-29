package com.zdx;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		char[][] map = new char[n+1][2*n+1];
		for(int i = 0;i <= n;i++)
			for(int j = n-i;j <= n+i;j++)
				map[i][j] = '*';
		for(int i = 0;i <= n;i++) {
			for(int j = 0;j <= n*2;j++) {
				if(map[i][j] == '*')
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
			
		for(int i = n-1;i >= 0;i--) {
			for(int j = 0;j <= n*2;j++) {
				if(map[i][j] == '*')
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}

}
