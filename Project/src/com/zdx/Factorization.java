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
			x++;// ��2��ʼ�ж��ܷ�n����
			while (n % x == 0) {
				n = n / x;
				if (t == 1) {
					System.out.print(x);//������Ա�n�����ĵ�һ����
					t = 0;
				} else
					System.out.print("*" + x);
			}
		}


	}

}
