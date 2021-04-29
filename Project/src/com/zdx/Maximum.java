package com.zdx;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();					//¸öÊý
		int m = scanner.nextInt();					//±ßÊý
		int[][] gragh = new int[n+1][n+1];
		for(int i = 0;i<m;i++) {
			int vertex1 = scanner.nextInt();
			int vertex2 = scanner.nextInt();
			int weight = scanner.nextInt();
			buildGragh(gragh,vertex1,vertex2,weight);
		}
		int[] path = new int[n+1];
		int flow = 0;
		while(BFSfindPath(gragh,1,n,path)){
			int min_capacity = minCapacity(path,gragh);
			flow += min_capacity;
			for(int i = n;i != 1; i = path[i]) {
				int j = path[i];
				gragh[j][i] -= min_capacity;
				gragh[i][j] += min_capacity;
			}
		}
		System.out.println(flow);
	}

	private static int minCapacity(int[] path, int[][] gragh) {
		int min = gragh[path[path.length - 1]][path.length - 1];
		for(int i = path.length - 2;i != 1; i = path[i]) {
			if(gragh[path[i]][i] < min && gragh[path[i]][i] > 0) {
				min = gragh[path[i]][i];
			}
		}
		return min;
	}

	private static boolean BFSfindPath(int[][] gragh, int s, int t, int[] path) {
		for(int i = 0;i < path.length;i++) {
			path[i] = 0;
		}
		int vertex_num = gragh.length;
		boolean[] visited = new boolean[vertex_num];
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(s);
		visited[s] = true;
		while(q.isEmpty() == false) {
			int tem = q.poll();
			for(int i = 1;i < vertex_num; i++) {
				if(gragh[tem][i] > 0 && visited[i] == false) {
					q.add(i);
					visited[i] = true;
					path[i] = tem;
				}
			}
		}
		return visited[t] == true;
	}

	private static void buildGragh(int[][] gragh, int vertex1, int vertex2, int weight) {
		gragh[vertex1][vertex2] += weight;
	}

}
