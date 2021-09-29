// @algorithm @lc id=100277 lang=java 
// @title qing-wa-tiao-tai-jie-wen-ti-lcof


package ____Offer_10__II__________LCOF;
class Solution {
    public int numWays(int n) {
        int a = 1, b = 1, sum;
        for(int i = 0; i < n; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}