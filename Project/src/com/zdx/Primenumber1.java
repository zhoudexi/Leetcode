package com.zdx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Primenumber1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		scanner.close();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 2;i < n;i++) {
			if(prime(i)) {
				count++;
				list.add(i);
			}
		}
		System.out.println(count);
		for(int a:list)
			System.out.print(a + " ");
	}

	private static boolean prime(int i) {
		for(int j = 2;j < i;j++)
			if(i % j == 0)
				return false;
		return true;
	}
}
