package com.zdx;

import java.util.Scanner;

public class Biggestformula {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n+1];
		int[] sum=new int[n+1];
		long[][] ans= new long[n+1][k+1];
		sum[0]=0;
		for(int i=1;i<=n;i++){
			a[i]=sc.nextInt();
			sum[i]=sum[i-1]+a[i];//��1��i�����ĺͣ�
		}
		sc.close();
		for(int i=1;i<=n;i++){
			ans[i][0]=sum[i];//ȫ�ǼӺŵ������
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=k;j++){
				for(int l=2;l<=i;l++){
					int b=sum[i]-sum[l-1];//l-1������i����֮�ͣ�
					ans[i][j]=Math.max(ans[i][j], ans[l-1][j-1]*b);//ans[i][j]��ʾ��ǰi�����в���j���˺����ܴﵽ����������
				}
			}
		}
		System.out.println(ans[n][k]);
	}

}
