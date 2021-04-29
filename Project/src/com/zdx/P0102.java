package com.zdx;

import java.util.Scanner;

public class P0102 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String t = Integer.valueOf(s,16).toString();
		char[] tt = new char[4];
		int[] ttt = new int[4];
		int ten = 0;
		for(int i = 0;i < t.length();i++) {
			tt[i] = t.charAt(i);
			ttt[i] = tt[i] - '0';
			ten = ten * 10 + ttt[i];
		}
		if(s.length() == 1)
			System.out.println("Hex: 0x00" + s);
		else if (s.length() == 2)
			System.out.println("Hex: 0x0" + s);
		else if (s.length() == 3)
			System.out.println("Hex: 0x" + s);
		System.out.println("Decimal: "+ t);
		String e = Integer.toOctalString(ten);
		if (e.length() == 1)
			System.out.println("Octal: 000" + e);
		else if (e.length() == 2)
			System.out.println("Octal: 00" + e);
		else if (e.length() == 3)
			System.out.println("Octal: 0" + e);
		if (e.length() == 4)
			System.out.println("Octal: " + e);
	}
}
