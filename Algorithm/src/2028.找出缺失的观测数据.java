/*
 * @lc app=leetcode.cn id=2028 lang=java
 *
 * [2028] 找出缺失的观测数据
 */

// @lc code=start
class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int sum = mean * (n + m);
        int missingSum = sum;
        for (int roll : rolls) {
            missingSum -= roll;
        }
        if (missingSum < n || missingSum > 6 * n) {
            return new int[0];
        }
        int quotient = missingSum / n, remainder = missingSum % n;
        int[] missing = new int[n];
        for (int i = 0; i < n; i++) {
            missing[i] = quotient + (i < remainder ? 1 : 0);
        }
        return missing;
    }
}
// @lc code=end

