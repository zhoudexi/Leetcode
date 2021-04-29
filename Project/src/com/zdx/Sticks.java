		package com.zdx;
		
		import java.util.Scanner;
		
		public class Sticks {
			public static int g;//ƴ�Ӻ�ľ����
			public static int lens;//ƴ�Ӻ�ľ������
		
			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				int[][] len = new int[100][100];//ÿ�鳤��
				int[] sumlen = new int[100];//�ܳ���
				int[] num = new int[100];//����
				int[] a = new int[100];//��������
				int n;//����
				
				//����
				int inc = 0;//��������
				int sum;//�����ܳ���
				while(true) {
					n = scanner.nextInt();
					num[inc] = n;
					if(n == 0) {
						break;
					}
					sum = 0;
					for(int i = 0;i < n;i++) {
						len[inc][i] = scanner.nextInt();
						sum += len[inc][i];
					}
					sumlen[inc] = sum;
					inc++;
				}
				
				//�ݹ�����
				for(int i = 0;i < inc;i++) {
					int[] visited = new int[100];
					for(int j = 0;j<num[i];j++) {
						a[j] = len[i][j];
					}
					sort(a,num[i]);
					for(lens = a[0];lens <= sumlen[i];lens++) {
						if(sumlen[i] % lens != 0) {
							continue;
						}
						g = sumlen[i] / lens;
						if(dfs(a,visited,num[i],0,0,0)) {
							break;
						}
					}
					//���
					System.out.println(lens);
				}
			}
			/*
			  ����
			  a ��������
			  visited ���ʱ��
			  n ����
			  nowlen ��ǰ����
			  nowg ��ǰľ������nowg = g����Ҫ��
			  cnt �±�
			 */
			private static boolean dfs(int[] a, int[] visited, int n, int nowlen, int nowg, int cnt) {
				if(cnt >= n) return false;
				if(nowg == g) return true;
				//����
				for(int i = cnt;i < n;i++) {
					if(visited[i] == 0) {
						if(nowlen + a[i] == lens) {
							if(dfs(a,visited,n,0,nowg+1,nowg)) {
								return true;
							}
							visited[i] = 0;
							return false;
						}
						if(nowlen + a[i] < lens) {
							visited[i] = 1;
							if(dfs(a,visited,n,nowlen+a[i],nowg,i+1)) {
								return true;
							}
							visited[i] = 0;
							if(nowlen == 0) return false;
							for(;a[i] == a[i+1] && i + 1 < n;i++);
						}
					}
				}
				return false;
			}
			//ð��
			private static void sort(int[] a, int num) {
				int temp;
				for(int i = 0;i < num - 1;i++) {
					for(int j = i+1;j < num;j++) {
						if(a[i] < a[j]) {
							temp = a[i];
							a[i] = a[j];
							a[j] = temp;
						}
					}
				}
			}
		
		}
