package com.zdx;

import java.util.ArrayList;
import java.util.Scanner;

public class MSQualityfactor {
	public static boolean[] Not_MS_Num = new boolean[300005];
	public static ArrayList<Integer> MS_Num = new ArrayList<>();
	public static int N;
	public static void main(String[] args) {
		for(int i = 6;i <= 30000;) {
			if(Not_MS_Num[i] == false) {
				MS_Num.add(i);
				for(int k = 6;k * i <= 30000;) {
					Not_MS_Num[k * i] = true;
					if(k % 7 == 6)
						k += 2;
					else
						k += 5;
				}
			}
			if(i % 7 == 6)
				i += 2;
			else
				i += 5;
		}
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		while(N > 1) {
			System.out.print(N+":");
			for(int i = 0;i < MS_Num.size() && MS_Num.get(i) <= N;++i) {
				if(N % MS_Num.get(i) == 0)
					System.out.print(" "+MS_Num.get(i));
			}
			N = scanner.nextInt();
			System.out.println();
		}
	}

}
