package com.zdx;

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		String s2 = scanner.next();
		scanner.close();
		if(s1.length() != s2.length()) {
			System.out.print("N");
			return;
		}
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		int[] a = new int[27];
		int[] b = new int[27];
		for(int i = 0;i <s1.length();i++) {
			int n = s1.charAt(i) - 'a';
			int m = s2.charAt(i) - 'a';
			a[n]++;
			b[m]++;
		}
		for(int i = 0;i < 27;i++) {
			if(a[i] != b[i]) {
				System.out.print("N");
				return;
			}
				
		}
		System.out.print("Y");
	}
}
