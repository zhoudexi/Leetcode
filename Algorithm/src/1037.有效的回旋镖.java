/*
 * @lc app=leetcode.cn id=1037 lang=java
 *
 * [1037] 有效的回旋镖
 */

// @lc code=start
    class Solution {
        public boolean isBoomerang(int[][] ps) {
            return (ps[1][0] - ps[0][0]) * (ps[2][1] - ps[0][1]) != (ps[2][0] - ps[0][0]) * (ps[1][1] - ps[0][1]);
        }
    }
// @lc code=end

