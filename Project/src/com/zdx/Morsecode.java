package com.zdx;

import java.util.Scanner;

public class Morsecode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int start = 0,end = 0;
		String str2 ;
		while(true) {
			end = s.indexOf("|",start);
			if(end < 0)
				str2  = s.substring(start);
			else 
				str2  = s.substring(start,end);
			start = end + 1;
			if (str2.equals("*-"))
				System.out.print("a");
			else if (str2.equals("-***"))
				System.out.print("b");
			else if (str2.equals("-*-*"))
				System.out.print("c");
			else if (str2.equals("-**"))
				System.out.print("d");
			else if (str2.equals("*"))
				System.out.print("e");
			else if (str2.equals("**-*"))
				System.out.print("f");
			else if (str2.equals("--*"))
				System.out.print("g");
			else if (str2.equals("****"))
				System.out.print("h");
			else if (str2.equals("**"))
				System.out.print("i");
			else if (str2.equals("*---"))
				System.out.print("j");
			else if (str2.equals("-*-"))
				System.out.print("k");
			else if (str2.equals("*-**"))
				System.out.print("l");
			else if (str2.equals("--"))
				System.out.print("m");
			else if (str2.equals("-*"))
				System.out.print("n");
			else if (str2.equals("---"))
				System.out.print("o");
			else if (str2.equals("*--*"))
				System.out.print("p");
			else if (str2.equals("**-"))
				System.out.print("q");
			else if (str2.equals("***-"))
				System.out.print("r");
			else if (str2.equals("***"))
				System.out.print("s");
			else if (str2.equals("-"))
				System.out.print("t");
			else if (str2.equals("**-"))
				System.out.print("u");
			else if (str2.equals("***-"))
				System.out.print("v");
			else if (str2.equals("*--"))
				System.out.print("w");
			else if (str2.equals("-**-"))
				System.out.print("x");
			else if (str2.equals("-*--"))
				System.out.print("y");
			else if (str2.equals("--**"))
				System.out.print("z");
			if(end < 0)
				break;
		}
	}
}
