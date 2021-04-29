package com.zdx;

import java.util.Arrays;
import java.util.Scanner;

public class SortGoods {
	public static class goods{
		int num;
		double price;
		int off;
		public goods(){
			num = 0;
			price = 0;
			off = 0;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double S = scanner.nextDouble();
		int N = scanner.nextInt();
		goods[] goods = new goods[N];
		for(int i = 0;i < N;i++) {
			goods[i] = new goods();
			goods[i].price = scanner.nextDouble();
			goods[i].off = scanner.nextInt();
			goods[i].num = i + 1;
		}
		for(int i = 0; i < N-1;i++)
			for(int j = i+1;j < N;j++) {
				if(goods[i].price * goods[i].off < goods[j].price * goods[j].off) {
					goods temp;
					temp = goods[j];
					goods[j] = goods[i];
					goods[i] = temp;
				}
				else if(goods[i].price * goods[i].off == goods[j].price * goods[j].off) {
					if(goods[i].price > goods[j].price) {
						goods temp;
						temp = goods[j];
						goods[j] = goods[i];
						goods[i] = temp;
					}else if(goods[i].price > goods[j].price) {
						if(goods[i].num > goods[j].num) {
							goods temp;
							temp = goods[j];
							goods[j] = goods[i];
							goods[i] = temp;
						}
					}
				}
			}
			int[] res = new int[N];
			int count = 0;
			for(int i = 0;i < N;i++) {
				double realPrice = goods[i].price - goods[i].price * goods[i].off * 0.5;
				if(realPrice <= S) {
					S -= realPrice;
					res[count] = goods[i].num;
					count++;
				}
			}
			if(count == 0)
				System.out.println(0);
			Arrays.sort(res);
			for(int i = 0;i < N;i++) {
				if(res[i] != 0)
					System.out.println(res[i] + " ");
			}
	}

}
