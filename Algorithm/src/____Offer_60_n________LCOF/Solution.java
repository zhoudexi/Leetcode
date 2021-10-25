// @algorithm @lc id=100339 lang=java 
// @title nge-tou-zi-de-dian-shu-lcof


package ____Offer_60_n________LCOF;
public class Solution {
    public double[] dicesProbability(int n) {
        int[][] dp = new int[n + 1][6 * n + 1];
        for(int i = 1;i <= 6;i++) dp[1][i] = 1;
        for (int i = 1; i <= n; i++) 
            for(int j = i; j <= 6 * i; j++)
                for (int k = 1; k <= 6 && k <= j; k++) 
                    dp[i][j] += dp[i - 1][j - k];
        double[] ans = new double[6 * n - n + 1];
        for (int i = n; i <= 6 * n; i++) ans[i - n] = ((double)dp[n][i]) / (Math.pow(6, n));
        return ans;
    }
}