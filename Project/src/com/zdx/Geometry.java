package com.zdx;

import java.util.Scanner;

public class Geometry {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		double x3 = scanner.nextDouble();
		double y3 = scanner.nextDouble();
		double x4 = scanner.nextDouble();
		double y4 = scanner.nextDouble();
		double k1 = (y1 - y3)/(x1 - x3);
		double k2 = (y2 - y4)/(x2 - x4);
		double b1=(x3*y1-x1*y3)/(x3-x1);
	    double b2=(x4*y2-x2*y4)/(x4-x2);
	    if(k1 == k2)
	    	System.out.println("LLJJ");
	    else {
	    	double x = (b2-b1)/(k1-k2);
	    	double y = k1*x+b1;
	    	System.out.printf("%.5f %.5f\n",x,y);
	    }
	}

}
