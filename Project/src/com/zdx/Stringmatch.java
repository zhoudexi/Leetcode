package com.zdx;

import java.util.Scanner;

public class Stringmatch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int num = scanner.nextInt();
		int n = scanner.nextInt();
		if(num == 0)
			s = s.toLowerCase();
		String[] ss = new String[n];
		for(int i = 0;i < n;i++)
			ss[i] = scanner.next();
		scanner.close();
		for(int i = 0;i < n;i++) {
			if(num == 0) {
				if(ss[i].toLowerCase().contains(s))
					System.out.println(ss[i]);
			}else {
				if(ss[i].contains(s))
					System.out.println(ss[i]);
			}
		}
	}
}
