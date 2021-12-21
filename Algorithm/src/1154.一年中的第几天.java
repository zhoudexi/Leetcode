/*
 * @lc app=leetcode.cn id=1154 lang=java
 *
 * [1154] 一年中的第几天
 */

// @lc code=start
class Solution {
    public int dayOfYear(String date) {
        int[] dd = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] s = date.split("-");
        int y = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]), d = Integer.parseInt(s[2]);
        int ans = 0;
        if(((y % 4 == 0) && (y % 100 != 0)) || y % 400 == 0) dd[1]++;
        for (int i = 0; i < m - 1; i++) {
            ans += dd[i];
        }
        ans += d;
        return ans;
    }
}
// @lc code=end

