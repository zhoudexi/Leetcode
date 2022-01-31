/*
 * @lc app=leetcode.cn id=1342 lang=java
 *
 * [1342] 将数字变成 0 的操作次数
 */

// @lc code=start
class Solution {
    public int numberOfSteps(int num) {
        return Math.max(getLoc(num) + getCnt(num) - 1, 0);
    }
    int getLoc(int x) {
        for (int i = 31; i >= 0; i--) {
            if (((x >> i) & 1) == 1) return i + 1;
        }
        return -1; // never
    }
    int getCnt(int x) {
        int ans = 0;
        for (int i = 31; i >= 0; i--) {
            if (((x >> i) & 1) == 1) ans++;
        }
        return ans;
    }
}
// @lc code=end

