package com.zdx;

import java.util.Scanner;

public class SortGrade1 {
	public static class grade{
		String name;
		int grade;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		grade[] g = new grade[n];
		for(int i = 0;i < n;i++) {
			g[i] = new grade();
			g[i].name = scanner.next();
			g[i].grade = scanner.nextInt();
		}
		scanner.close();
		for(int i = 0;i < n-1;i++)
			for(int j = i + 1;j < n;j++) {
				if(g[i].grade < g[j].grade) {
					grade temp = new grade();
					temp = g[j];
					g[j] = g[i];
					g[i] = temp;
				}else if(g[i].grade == g[j].grade) {
					if(g[j].name.compareTo(g[j].name) > 0) {
						grade temp = new grade();
						temp = g[j];
						g[j] = g[i];
						g[i] = temp;
					}
				}
			}
		for(int i = 0;i < n;i++)
			System.out.println(g[i].name);
	}
}
