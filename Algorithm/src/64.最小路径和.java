/*
 * @lc app=leetcode.cn id=64 lang=java
 *
 * [64] 最小路径和
 */

// @lc code=start
class Solution {
    private int[][] direction = {{1,0}, {0,-1}};
    int m, n;
    public int minPathSum(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int min = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                min = Math.min(min, dfs(grid, i, j));
            }
        }
        return min;
    }
    private int dfs(int[][] grid, int i, int j) {
        if(i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0)
            return 0;
        grid[i][j] = 0;
        int sum = 0;
        for(int[] d : direction)
            sum += dfs(grid, i + d[0], j + d[1]);
        return sum;
    }
}
// @lc code=end

