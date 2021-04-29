package com.zdx;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i = 0;i < arr.length;i++) {
			arr[i] = scanner.nextInt();
			if(arr[i] == 0)
				break;
		}
		quicksort(arr,0,arr.length-1);
		for (int i = 0; i < arr.length; i++) {
        	if (arr[i]!=0) 
        		System.out.print(arr[i]+" ");	
		}
	}

	private static void quicksort(int[] arr, int leftIndex, int rightIndex) {
		if(leftIndex >= rightIndex)
			return;
		int left = leftIndex;
		int right = rightIndex;
		int key = arr[left];
		while(left < right) {
			while(right > left && arr[right] >= key)
				right--;
			arr[left] = arr[right];
			while(left < right && arr[left] <= key)
				left++;
			arr[right] = arr[left];
		}
		arr[left] = key;
		quicksort(arr, leftIndex, left - 1);
		quicksort(arr, right + 1, rightIndex);
	}
}
