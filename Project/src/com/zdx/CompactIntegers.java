package com.zdx;

import java.util.Scanner;

public class CompactIntegers {
	private static int l = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++)
			arr[i] = scanner.nextInt();
		CompactIntegers(arr,n);
	}

	private static int CompactIntegers(int[] arr, int n) {
		int[] temp = new int[n];
		for(int i = 0;i < n;i++) {
			if(arr[i] != 0) {
				temp[l++] = arr[i];
			}		
		}
		System.out.println(l);  
        for(int i = 0 ; i < l ; i++) 
            System.out.print(temp[i] + " ");
		return l;
	}
}
