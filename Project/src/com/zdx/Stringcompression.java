package com.zdx;

import java.util.Scanner;

public class Stringcompression {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		char[] str = s.toCharArray();
		int[] count = new int[str.length];
		for(int i = 0;i < str.length;i++)
			for(int j = 0;j <= i;j++)
				if(str[i] == str[j])
					count[i]++;
		for(int i = 0;i < str.length;i++)
			if(count[i] == 1 || count[i] == 3 || count[i] == 6 || str[i] == ' ')
				System.out.print(str[i]);
	}

}
