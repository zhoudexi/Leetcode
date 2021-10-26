// @algorithm @lc id=100335 lang=java 
// @title bu-yong-jia-jian-cheng-chu-zuo-jia-fa-lcof


package ____Offer_65___________LCOF;
public class Solution {
    public int add(int a, int b) {
        while(b != 0){
            int c = (a & b) << 1;
            a ^= b;
            b = c;
        }
		return a;
    }
}