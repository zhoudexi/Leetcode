/*
 * @lc app=leetcode.cn id=1034 lang=java
 *
 * [1034] 边框着色
 */

// @lc code=start
class Solution {
    int m, n, c;
    int[][] grid, ans;
    int[][] dirs = new int[][]{{1,0}, {-1,0}, {0,1}, {0,-1}};
    public int[][] colorBorder(int[][] _grid, int row, int col, int color) {
        grid = _grid; c = color;
        m = grid.length; n = grid[0].length;
        ans = new int[m][n];
        dfs(row, col);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (ans[i][j] == 0) ans[i][j] = grid[i][j];
            }
        }
        return ans;
    }
    void dfs(int x, int y) {
        int cnt = 0;
        for (int[] di : dirs) {
            int nx = x + di[0], ny = y + di[1];
            if (nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
            if (grid[x][y] != grid[nx][ny]) continue;
            else cnt++;
            if (ans[nx][ny] != 0) continue;
            ans[nx][ny] = -1;
            dfs(nx, ny);
        }
        ans[x][y] = cnt == 4 ? grid[x][y] : c;
    }
}
// @lc code=end

