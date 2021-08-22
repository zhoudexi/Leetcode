class Solution {
    private int m,n;
    private int[][] direction = {{0,1},{0,-1},{1,0},{-1,0}};
    public int maxAreaOfIsland(int[][] grid) {
        if(grid == null || grid.length == 0)
            return 0;
        m = grid.length;
        n = grid[0].length;
        int maxArea = 0;
        for (int i = 0; i < m; i++) 
            for (int j = 0; j < n; j++)
                maxArea = Math.max(maxArea, dfs(grid, i, j));
        return maxArea;
    }
    private int dfs(int[][] grid, int i, int j) {
        if(i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0)
            return 0;
        grid[i][j] = 0;
        int area = 1;
        for(int[] d : direction)
            area += dfs(grid, i + d[0], j + d[1]);
        return area;
    }
}