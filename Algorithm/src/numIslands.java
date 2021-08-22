class Solution {
    private int m, n;
    private int[][] direction = {{0,1}, {1,0}, {0,-1}, {-1,0}};
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0)
            return 0;
        int areanum = 0;
        m = grid.length;
        n = grid[0].length;
        for (int i = 0; i < m; i++) 
            for (int j = 0; j < n; j++){
                if(grid[i][j] != '0'){
                    dfs(grid, i, j);
                    areanum++;
                }
            }
        return areanum;
    }
    private void dfs(char[][] grid, int i, int j) {
        if(i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0')
            return;
        grid[i][j] = '0';
        for(int[] d : direction)
            dfs(grid, i + d[0], j + d[1]);
    }
}


