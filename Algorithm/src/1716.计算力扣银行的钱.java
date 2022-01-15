/*
 * @lc app=leetcode.cn id=1716 lang=java
 *
 * [1716] 计算力扣银行的钱
 */

// @lc code=start
class Solution {
    public int totalMoney(int n) {
        int x = n / 7;
        int y = n % 7;
        return 28 * x + 7 * x * (x - 1) / 2 + x * y + y * (y + 1) / 2;
    }
}
// @lc code=end

