package com.zdx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Dynamicarray {
	public static int sum = 0;
	public static int avg = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0;i < n;i++)
			list.add(scanner.nextInt());
		System.out.print(sum(list) + " " + average(list,n));
	}

	private static int average(ArrayList<Integer> list, int n) {
		sum = 0;
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext())
			sum += iterator.next();
		avg = sum / n;
		return avg;
	}

	private static int sum(ArrayList<Integer> list) {
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext())
			sum += iterator.next();
		return sum;
	}
}
