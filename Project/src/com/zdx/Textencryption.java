package com.zdx;

import java.util.Scanner;

public class Textencryption {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] c = scanner.next().toCharArray();
		EncryptChar(c);
	}

	private static void EncryptChar(char[] c) {
		for(int i = 0;i < c.length;i++) {
			if(c[i] >= 'A' && c[i] < 'Z' || c[i] >= 'a' && c[i] < 'z')
				c[i]++;
			else if(c[i] == 'z')
				c[i] = 'A';
			else if(c[i] == 'Z')
				c[i] = 'a';
		}
		for(char i:c)
			System.out.print(i);
	}
}
