package com.zdx;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Primefactor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		Set<Integer> set = new HashSet<>();
		for(int i = 2;i <= n;i++) {
			while(n % i == 0) {
				n /= i;
				set.add(i);
			}
			if(n < i)
				break;
		}
		int num = 1;
		for(int a:set)
			num *= a;
		System.out.println(num);
	}
}
