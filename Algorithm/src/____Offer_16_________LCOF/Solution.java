// @algorithm @lc id=100295 lang=java 
// @title shu-zhi-de-zheng-shu-ci-fang-lcof


package ____Offer_16_________LCOF;
public class Solution {
    public double myPow(double x, int n) {
        if(x == 0) return 0;
        long b = n;
        double res = 1.0;
        if(b < 0){
            x = 1/x;
            b = -b;
        }
        while(b > 0){
            if((b & 1) == 1) res *= x;
            x *= x;
            b >>= 1;
        }
        return res;
    }
}