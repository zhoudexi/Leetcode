// @algorithm @lc id=100284 lang=java 
// @title jian-sheng-zi-lcof


package ____Offer_14__I______LCOF;
public class Solution {
    public int cuttingRope(int n) {
        // int[] dp = new int[n + 1];
        // dp[2] = 1;
        // for (int i = 3; i <= n; i++) {
        //     for (int j = 2; j < i; j++) {
        //         dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
        //     }
        // }
        // return dp[n];
        if(n < 4) return n - 1;
        int res = 1;
        while(n > 4){
            res *= 3;
            n -= 3;
        }
        return res * n;
    }
}