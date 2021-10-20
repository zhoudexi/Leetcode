// @algorithm @lc id=100327 lang=java 
// @title li-wu-de-zui-da-jie-zhi-lcof


package ____Offer_47_________LCOF;
public class Solution {
    public int maxValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for (int i = 1; i < n; i++)  
            grid[0][i] += grid[0][i - 1];
        for (int i = 1; i < m; i++) 
            grid[i][0] += grid[i - 1][0];
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.max(grid[i][j - 1], grid[i - 1][j]);
            }
        }
        return grid[m - 1][n - 1];
    }
}