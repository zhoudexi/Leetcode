package com.zdx;

import java.util.Scanner;

public class Binarynumber {

	public static void main(String[] args) {
		int cout = 0,a,b;
		Scanner scanner = new Scanner(System.in);
		int L = scanner.nextInt();
		int R = scanner.nextInt();
		for(int i = L;i <= R;i++) {
			a = i;
			while(a != 0) {
				b = a % 2;
				if(b == 1)
					cout++;
				a /= 2;
			}
		}
		System.out.println(cout);
	}
}
