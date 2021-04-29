package com.zdx;

import java.util.Scanner;

public class Stringmanipulation {

	public static void main(String[] args) {
		char[] str = new char[40010];
		int index = 0;
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		for(int i = 0;i < s.length();i++) {
			str[i] = s.charAt(i);
			index++;
		}
		int q = scanner.nextInt();
		scanner.nextLine();
		while(q --> 0) {
			String[] order = scanner.nextLine().split(" ");
			String s1 = order[0];
			if(s1.equals("Append")) {
				String s2 = order[1];
				for(int i = index;i < index + s2.length();i++) {
					str[i] = s2.charAt(i - index);
				}
				index += s2.length();
			}else if(s1.equals("Insert")) {
				int x = Integer.parseInt(order[1]);
				String s2 = order[2];
				int len2 = s2.length();
				for(int i = index - 1 ;i >= x - 1;i--) {//先往后挪，留出空位置
					str[i + len2] = str[i]; 
				}
				for(int i = x - 1, j = 0;i < x - 1 + len2;i++, j++) {//下标从0开始，需要x-1
					str[i] = s2.charAt(j);//将字符串插入空位置
				}
				index += len2;
			}else if(s1.equals("Swap")) {
				int a = Integer.parseInt(order[1]);
				int b = Integer.parseInt(order[2]);
				int c = Integer.parseInt(order[3]);
				int d = Integer.parseInt(order[4]);
				StringBuilder sb1 = new StringBuilder();
				String sss = String.valueOf(str);
				String ss1 = sss.substring(0, a - 1);
				String ss2 = sss.substring(a - 1, b);
				String ss3 = sss.substring(b, c - 1);
				String ss4 = sss.substring(c - 1, d);
				String ss5 = sss.substring(d, index);
				String res = sb1.append(ss1).append(ss4).append(ss3).append(ss2).append(ss5).toString();
				for(int i = 0;i < res.length();i++){
					str[i] = res.charAt(i);
				}
			}else if(s1.equals("Reverse")) {
				int a = Integer.parseInt(order[1]);
				int b = Integer.parseInt(order[2]);
				StringBuilder tmp = new StringBuilder(); 
				for(int i = a - 1;i <= b - 1;i++) {
					tmp.append(str[i]);
				}
				String ss = tmp.reverse().toString();
				for(int i = 0;i < ss.length();i++) {//反转之后覆盖原区间
					str[a - 1] = ss.charAt(i);
					a++;
				}
			}
		}
		scanner.close();
		System.out.println(String.valueOf(str));
	}

}
