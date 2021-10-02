// @algorithm @lc id=100292 lang=java 
// @title er-jin-zhi-zhong-1de-ge-shu-lcof


package ____Offer_15_____1____LCOF;
public public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0){
            res++;
            n = n & n - 1;
        }
        return res;
    }
}