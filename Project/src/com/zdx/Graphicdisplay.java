package com.zdx;

import java.util.Scanner;

public class Graphicdisplay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i = 0;i < n;i++) {
			for(int j = i;j < n;j++) 
				System.out.print("* ");
			System.out.println();
		}	
	}
}
