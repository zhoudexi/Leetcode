package com.zdx;

import java.util.LinkedList;
import java.util.Scanner;

public class Abacus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		LinkedList<Integer> list = new LinkedList<>();
		for(int i = 0;i < n;i++)
			list.add(scanner.nextInt());
		Integer[] arr = new Integer[list.size()];
		list.toArray(arr);
		for(int i = 0;i < arr.length;i++)
			for(int j = 0;j < arr.length;j++) {
				if(j != i) {
					for(int k = j + 1;k < arr.length;k++) {
						if(k != i && arr[k] + arr[j] == arr[i]) {
							count++;
							k = arr.length;
							j = k;
						}
					}
				}
			}
		System.out.println(count);
	}

}
