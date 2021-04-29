package com.zdx;

import java.util.Scanner;

public class Decomposeprimefactors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i = 2;
		while(n > 1) {
			if(n % i == 0) {
				n /= i;
				System.out.printf("%d ",i);
			}
			else 
				i++;
		}
	}
}
