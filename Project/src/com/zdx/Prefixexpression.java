package com.zdx;

import java.util.Scanner;

public class Prefixexpression {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		if(s.equals("+"))
			System.out.print(add(a,b));
		else if(s.equals("-"))
			System.out.print(subtract(a,b));
		else if(s.equals("*"))
			System.out.println(multiply(a,b));
		else if(s.equals("/"))
			System.out.println(divide(a,b));
	}

	private static int divide(int a, int b) {
		return a/b;
	}

	private static int multiply(int a, int b) {
		return a*b;
	}

	private static int subtract(int a, int b) {
		return a-b;
		
	}

	private static int add(int a, int b) {
		return a+b;
	}
}
