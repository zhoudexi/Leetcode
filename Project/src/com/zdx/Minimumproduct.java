package com.zdx;

import java.util.Arrays;
import java.util.Scanner;

public class Minimumproduct {

	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while(n != 0) {
			int m = scanner.nextInt();
			int[] a = new int[m];
			int[] b = new int[m];
			for(int i = 0;i < m;i++)
				a[i] = scanner.nextInt();
			for(int i = 0;i < m;i++)
				b[i] = scanner.nextInt();
			Arrays.sort(a);
			Arrays.sort(b);
			for(int i=0,j=a.length-1;i<a.length;i++,j--){
				sum+=a[i]*b[j];
			}
			System.out.println(sum);
			sum = 0;
			n--;
		}
	}
}
