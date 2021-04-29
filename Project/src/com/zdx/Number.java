package com.zdx;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		int cout = 0,a,b;
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextInt();
		scanner.close();
		for(int i = 1;i <= n;i++) {
			a = i;
			while(a != 0) {
				b = a % 10;
				if(b == 1)
					cout++;
				a /= 10;
			}
		}
		System.out.println(cout);	
	}

}
