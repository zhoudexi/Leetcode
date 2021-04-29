package com.zdx;

import java.util.Scanner;

public class Strcmp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		String s2 = scanner.next();
		if(s1.compareTo(s2) > 0)
			System.out.println(1);
		else if(s1.compareTo(s2) == 0)
			System.out.println(0);
		else if(s1.compareTo(s2) < 0)
			System.out.println(-1);
	}
}
