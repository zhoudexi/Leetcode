package com.zdx;

import java.util.Scanner;

public class Capital {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		if(s.hashCode() >= 65 && s.hashCode() <= 90)
			System.out.println(s.toLowerCase());
		else
			System.out.println(s.toUpperCase());
		
	}
}
