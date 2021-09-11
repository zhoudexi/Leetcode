/*
 * @lc app=leetcode.cn id=343 lang=java
 *
 * [343] 整数拆分
 */

// @lc code=start
class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int cur = 0;
            for (int j = 0; j < i; j++) {
                cur = Math.max(cur, Math.max(j * (i - j), j * dp[i - j]));
            }
            dp[i] = cur;
        }
        return dp[n];
    }
}
// @lc code=end

