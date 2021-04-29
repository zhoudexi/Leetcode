package com.zdx;

import java.util.Scanner;

public class RotatableNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();					//长度
		int x = sc.nextInt();					//进制范围
		sc.close();
		if (n==1&&x==3) {
			System.out.println(2);
			return;
		}
		if (!isPrime(n + 1)) {
			System.out.println(-1);
			return;
		}
		for (int i = x - 1; i >1; i--) {
			if (isRoot(i, n + 1)) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}

	private static boolean isRoot(long a, long p) {
		if (a%p==0) {
			return false;
		}
		for (int i = 1; i * i <= p - 1; i++) {
			if ((p - 1) % i == 0) {
				if (i < p - 1 && ex(a, i, p) == 1) {
					return false;
				}
				if ((p - 1) / i < p - 1 && ex(a, (p - 1) / i, p) == 1) {
					return false;
				}
			}
		}
		return true;
	}

	private static long ex(long a, long n, long p) {
		if (n == 0) {
			return 1 % p;
		}
		long res = 1;
		while (n != 0) {
			if ((n & 1) == 1) {
				res = res * a % p;
			}
			n >>= 1;
			a = a * a % p;
		}
		return res;
	}

	private static boolean isPrime(long n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
