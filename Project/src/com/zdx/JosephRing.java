package com.zdx;

import java.util.Scanner;

public class JosephRing {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int p = 0;
		for(int i = 2;i <= n;i++) 
			p = (p + m) % i;
		System.out.println(p+1);
	}
}
