package com.zdx;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queueoperation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 0;i < n;++i) {
			int x = scanner.nextInt();
			if(x == 1)
				queue.offer(scanner.nextInt());
			else if(x == 2) {
				Integer y = queue.poll();
				if(y != null)
					System.out.println(y);
				else {
					System.out.println("no");
					break;
				}
			}else if(x == 3)
				System.out.println(queue.size());
		}
		scanner.close();
	}

}
