package com.zdx;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Numbergrouping {
	static int max = 11;
    static double num[] = new double[max];
	public static void main(String[] args) {
		Scanner cin  = new Scanner(System.in);
        for(int i=0;i<10;i++)
            num[i] = cin.nextDouble();
        Arrays.sort(num,0,10);
        int tag1=0,tag2=0;
        double len1=0.0,len2=0.0;
        for(int i=0;i<9;i++) {
            double x = num[i+1]-num[i];
            if(x>len1) {
                len2 = len1;
                tag2 = tag1;
                len1 = x;
                tag1 = i;
            }
            else if(x>len2) {
                tag2 = i;
                len2 = x;
            }
        }
        double sum = 0.0;
        int cnt = 0;
        NumberFormat nf = NumberFormat.getInstance();
        for(int i=0;i<10;i++) {
            sum += num[i];
            cnt++;
            if(i==tag1 ||i==tag2 || i==9) {
                System.out.println(nf.format(sum/cnt));
                sum = 0.0;
                cnt = 0;
            }
        }
	}

}
