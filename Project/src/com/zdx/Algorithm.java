package com.zdx;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Algorithm {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		int size = scanner.nextInt();
		StringBuilder builder = new StringBuilder("");
		BigInteger bigInteger = new BigInteger("1");
		for(int i = 0; i < size; i++) {
			String next = scanner.next();
			list.add(builder.append(next).append("<>").append(new BigInteger(next).add(bigInteger)).toString());
			builder.setLength(0);
		}
		for(String s : list) {
			System.out.println(s);
		}
	}

}
