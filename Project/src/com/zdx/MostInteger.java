package com.zdx;

import java.util.Scanner;

public class MostInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1 || n > 20) {
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];
        int count = 1;
        int maxCount = 1;
        int maxArr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (temp == arr[i]) {
                count++;
            } else {
                temp = arr[i];
                count = 1;
            }
            if (count > maxCount) {
                maxArr = temp;
                maxCount = count;
            }
        }
        System.out.println(maxArr);
    }
}
