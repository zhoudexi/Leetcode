package com.zdx;

import java.util.Scanner;

public class P0101 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n = scanner.nextDouble();
		double ans = n * 950 / (Math.pow(10, -23) * 3);
		int digit = 0;
		while(ans > 10) {
			ans /= 10;
			digit++;
		}
		System.out.printf("%.6f",ans);
		System.out.print("E+0");
		if(digit == 0)
			System.out.println("0" + digit);
		else
			System.out.println(digit);
	}

}
