package com.zdx;

import java.util.Scanner;

public class Quadraticequationinonevariable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int x = b*b-4*a*c;
		
		scanner.close();
		if(x > 0)
			System.out.print((int)(-b + Math.sqrt(x))/(2*a) + " " + (int)(-b - Math.sqrt(x))/(2*a));
		else if(x == 0)
			System.out.println(-b/(2*a));
		else
			System.out.println("NO");
	}

}
