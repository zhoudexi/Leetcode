package com.zdx;

import java.util.Scanner;

public class Hanoi {
	public static int step = 0;
	public static int m;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		m = scanner.nextInt();
		hanoi('A','B','C',n);
		System.out.println(step);
	}

	private static void hanoi(char A, char B, char C, int n) {
		if(n == 1) {
			step++;
			if(step == m)
				System.out.println("#"+n+":"+A+"->"+C);
			return;
		}
		hanoi(A, C, B, n-1);
		step++;
		if(step == m)
			System.out.println("#"+n+"£º"+A+"->"+C);
		hanoi(B, A, C, n-1);
	}

}
