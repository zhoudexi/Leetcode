package com.zdx;

import java.util.Arrays;
import java.util.Scanner;

public class SortGrade {
	public static class Students implements Comparable{
		int Math;
		int English;
		int Chinese;
		int Num;
		int Sum;
		
		@Override
		public String toString() {
			return this.Math + " " + this.English + " " + this.Chinese + " " + this.Num;
		}

		@Override
		public int compareTo(Object o) {
			Students s = (Students) o;
			if(this.Sum > s.Sum)
				return 1;
			else if(this.Sum == s.Sum && this.Math > s.Math) 
                return 1;
            else if (this.Sum == s.Sum && this.Math == s.Math && this.English > s.English) 
                return 1;
            else if (this.Math == s.Math && this.English == s.English && this.Sum == s.Sum && this.Num < s.Num) 
                return 1;
			return -1;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Students[] students = new Students[n];
		for(int i = 0;i < n;i++) {
			Students stu = new Students();
			stu.Math = scanner.nextInt();
			stu.English = scanner.nextInt();
			stu.Chinese = scanner.nextInt();
			stu.Num = i + 1;
			stu.Sum = stu.Chinese + stu.English + stu.Math;
			students[i] = stu;
		}
		Arrays.sort(students);
		for(int i = n - 1;i >= 0;i--)
			System.out.println(students[i].toString());
	}
	

}
