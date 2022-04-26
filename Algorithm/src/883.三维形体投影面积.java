/*
 * @lc app=leetcode.cn id=883 lang=java
 *
 * [883] 三维形体投影面积
 */

// @lc code=start
class Solution {
    public int projectionArea(int[][] g) {
        int ans1 = 0, ans2 = 0, ans3 = 0;
        int n = g.length;
        for (int i = 0; i < n; i++) {
            int a = 0, b = 0;
            for (int j = 0; j < n; j++) {
                if (g[i][j] > 0) ans1++;
                a = Math.max(a, g[i][j]);
                b = Math.max(b, g[j][i]);
            }
            ans2 += a; ans3 += b;
        }
        return ans1 + ans2 + ans3;
    }
}
// @lc code=end

