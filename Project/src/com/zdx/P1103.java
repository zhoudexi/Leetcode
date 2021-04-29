package com.zdx;

import java.util.Scanner;

public class P1103 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String[] num = s.split(" ");
		char aa = num[0].charAt(0);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double d = scanner.nextDouble();
		switch(aa) {
			case '+':
				System.out.printf("%.2f",a+c);
				System.out.print("+");
				System.out.printf("%.2f",d+b);
				System.out.print("i");
				break;
			case '-':
				System.out.printf("%.2f",a-c);
				System.out.print("+");
				System.out.printf("%.2f",b-d);
				System.out.print("i");
				break;
			case '*':
				System.out.printf("%.2f",a*c-b*d);
				System.out.print("+");
				System.out.printf("%.2f",a*d+b*c);
				System.out.print("i");
				break;
			case '/':
				System.out.printf("%.2f",(a*c + b*d)/(c*c + d*d));
				System.out.print("+");
				System.out.printf("%.2f",(b*c - a*d)/(c*c + d*d));
				System.out.print("i");
				break;
		}
	}

}
