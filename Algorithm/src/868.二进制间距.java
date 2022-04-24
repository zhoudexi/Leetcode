/*
 * @lc app=leetcode.cn id=868 lang=java
 *
 * [868] 二进制间距
 */

// @lc code=start
class Solution {
    public int binaryGap(int n) {
        int ans = 0;
        for (int i = 31, j = -1; i >= 0; i--) {
            if (((n >> i) & 1) == 1) {
                if (j != -1) ans = Math.max(ans, j - i);
                j = i;
            }
        }
        return ans;
    }
}

// @lc code=end

