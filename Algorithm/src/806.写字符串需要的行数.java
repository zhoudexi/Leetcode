/*
 * @lc app=leetcode.cn id=806 lang=java
 *
 * [806] 写字符串需要的行数
 */

// @lc code=start
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int a = 0, b = 0;
        for (char c : s.toCharArray()) {
            int t = widths[c - 'a'];
            if (b + t > 100 && ++a >= 0) b = t;
            else b += t;         
        }
        if (b != 0) a++;
        return new int[]{a, b};
    }
}
// @lc code=end

