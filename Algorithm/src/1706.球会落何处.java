/*
 * @lc app=leetcode.cn id=1706 lang=java
 *
 * [1706] 球会落何处
 */

// @lc code=start
class Solution {
    int m, n;
    int[][] g;
    public int[] findBall(int[][] grid) {
        g = grid;
        m = g.length; n = g[0].length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) ans[i] = getVal(i);
        return ans;
    }
    int getVal(int x) {
        int r = 0, c = x;
        while (r < m) {
            int ne = c + g[r][c];
            if (ne < 0 || ne >= n) return -1;
            if (g[r][c] != g[r][ne]) return -1;
            r++; c = ne;
        }
        return c;
    }
}
// @lc code=end

