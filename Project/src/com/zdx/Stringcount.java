package com.zdx;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Stringcount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int l = scanner.nextInt();
		String s = scanner.next();
		scanner.close();
		Map<String, Integer> map = new HashMap<>();
		int maxvalue = 0;
		String maxStr = "";
		for(int i = 0;i < s.length()-l-1;i++)
			for(int j = i + l;j <s.length();j++) {
				String str = s.substring(i,j);
				if(map.containsKey(str)) {
					int value = map.get(str);
					value++;
					if(value > maxvalue) {
						maxvalue = value;
						maxStr = str;
					}else if(value == maxvalue){
						if(maxStr.length() < str.length())
							maxStr = str;
					}
					map.put(str, value);
				}else
					map.put(str,0);	
			}
		System.out.println(maxStr);
	}
}
