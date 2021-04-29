package com.zdx;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		for(int i = 1;i <= n;i++) {
			int t = i;
			while (t != 0) {
				if(t % 10 == x)
					count++;
				t /= 10;
			}
		}
		System.out.println(count);
	}

}
