package com.zdx;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class DPLine {
	static int[] dp = new int[1000005];
	static Edge[] edge = new Edge[2005];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i = 0;i < n;i++) {
			int l = scanner.nextInt();
			int r = scanner.nextInt();
			int v = scanner.nextInt();
			edge[i] = new Edge(l, r, v);
		}
		Arrays.sort(edge, 0, n, new Comparator<Edge>() {
			@Override
			public int compare(Edge o1, Edge o2) {
				if (o1.r != o2.r) {
					return o1.r - o2.r;
				} else {
					return o1.l - o2.l;
				}
			}
		});
		dp[edge[0].r] = edge[0].v;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (edge[i].l <= edge[j].r){
	                dp[edge[i].r] = Math.max(dp[edge[i].r], Math.max(edge[i].v, dp[edge[j].r]));
	            } else {
	                dp[edge[i].r] = Math.max(dp[edge[i].r], edge[i].v + dp[edge[j].r]);
	            }
			}
		}
		System.out.println(dp[edge[n-1].r]);
	}
}
class Edge {
	int l;
	int r;
	int v;
	public Edge(int l, int r, int v) {
		super();
		this.l = l;
		this.r = r;
		this.v = v;
	}
}
