/*
 * @lc app=leetcode.cn id=829 lang=java
 *
 * [829] 连续整数求和
 */

// @lc code=start
class Solution {
    public int consecutiveNumbersSum(int n) {
        int ans = 0; n *= 2;
        for (int k = 1; k * k < n; k++) {
            if (n % k != 0) continue;
            if ((n / k - (k - 1)) % 2 == 0) ans++;
        }
        return ans;
    }
}

// @lc code=end

