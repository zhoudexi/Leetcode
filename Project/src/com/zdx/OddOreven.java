package com.zdx;

import java.util.Scanner;

public class OddOreven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n % 2 == 0)
			System.out.println("even");
		else if(n % 2 != 0)
			System.out.println("odd");
	}

}
