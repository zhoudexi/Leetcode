// @algorithm @lc id=100345 lang=java 
// @title qiu-12n-lcof


package ____Offer_64__1_2___n_LCOF;
public class Solution {
    int res = 0;
    public int sumNums(int n) {
        boolean b = n > 1 && sumNums(n - 1) > 0;
        res += n;
        return res;
    }
}