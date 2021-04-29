package com.zdx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Stringsize {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<String> list = new ArrayList<String>();
		for(int i = 0;i < n;i++)
			list.add(scanner.next());
		scanner.close();
		Set<String> set = new HashSet<String>(list);
		List<String> list1 = new ArrayList<String>(set);
		Collections.sort(list1);
		int[] arr = new int[list1.size()];
		for(int i = 0;i < list1.size();i++)
			for(int j = 0;j < list.size();j++)
				if(list1.get(i).equals(list.get(j)))
					arr[i]++;
		for(int i = 0;i < list1.size();i++)
			System.out.println(list1.get(i) + " " + arr[i]);
	}

}
