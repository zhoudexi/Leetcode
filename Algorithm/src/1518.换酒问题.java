/*
 * @lc app=leetcode.cn id=1518 lang=java
 *
 * [1518] 换酒问题
 */

// @lc code=start
class Solution {
    public int numWaterBottles(int n, int m) {
        int ans = n;
        while (n >= m) {
            int a = n / m, b = n % m;
            ans += a;
            n = a + b;
        }
        return ans;
    }
}
// @lc code=end

    