/*
 * @lc app=leetcode.cn id=1672 lang=java
 *
 * [1672] 最富有客户的资产总量
 */

// @lc code=start
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            maxWealth = Math.max(maxWealth, Arrays.stream(account).sum());
        }
        return maxWealth;
    }
}
// @lc code=end

