package com.zdx;

import java.util.Scanner;

public class Caseconversion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		char[] c = new char[100];
		for(int i = 0;i < s.length();i++) {
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				c[i] = s.toLowerCase().charAt(i);
			else
				c[i] = s.toUpperCase().charAt(i);
		}
		for(int i = 0;i < s.length();i++)
			System.out.print(c[i]);
	}
}
