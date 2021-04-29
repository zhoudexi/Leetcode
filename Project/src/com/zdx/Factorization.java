package com.zdx;

import java.util.ArrayList;
import java.util.Scanner;

public class Factorization {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = 1;
		int t = 1;
		while (n != 1) {
			x++;// 从2开始判断能否被n整除
			while (n % x == 0) {
				n = n / x;
				if (t == 1) {
					System.out.print(x);//输出可以被n整除的第一个数
					t = 0;
				} else
					System.out.print("*" + x);
			}
		}


	}

}
