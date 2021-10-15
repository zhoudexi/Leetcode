// @algorithm @lc id=100313 lang=java 
// @title shu-zi-xu-lie-zhong-mou-yi-wei-de-shu-zi-lcof


package ____Offer_44______________LCOF;
public class Solution {
    public int findNthDigit(int n) {
    int digit = 1;
    long start = 1;
    long count = 9;
    while(n > count){
      n -= count;
      digit += 1;
      start *= 10;
      count = digit * start * 9;
    }
    long num = start + (n - 1) / digit;
		return Long.toString(num).charAt((n - 1) % digit) - '0';  
    }
}