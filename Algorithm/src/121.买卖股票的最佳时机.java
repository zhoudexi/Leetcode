/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int pre = 0;
        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];
            pre = Math.max(diff + pre, 0);
            res = Math.max(res, pre);
        }
        return res;
    }
}
// @lc code=end

