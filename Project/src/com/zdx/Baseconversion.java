package com.zdx;

import java.util.Scanner;

public class Baseconversion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		
		
//		if(n == 0)
//			System.out.println(0);
//		else
//			System.out.println(0 + Integer.toOctalString(n));
		
		
		int[] arr = new int[8];
		for(int i = 0;i < arr.length;i++) {
			if((n & (int)Math.pow(2, i))!= 0)
				arr[i] = 1;
		}
		for(int i = arr.length-1;i>=0;i--)
			System.out.print(arr[i]);
	}
}
