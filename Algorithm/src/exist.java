class Solution {
    private int[][] direction = {{0,1},{1,0},{-1,0},{0,-1}};
    private int m, n;
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0)
            return false;
        m = board.length;
        n = board[0].length;
        boolean[][] hasvisited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(dfs(0, hasvisited, board, i, j, word))
                    return true;
            }
        }
        return false;
    }
    private boolean dfs(int k, boolean[][] hasvisited, char[][] board, int i, int j, String word) {
        if(k == word.length())
            return true;
        if(i < 0 || i >= m || j < 0 || j >= n || board[i][j] != word.charAt(k) || hasvisited[i][j])
            return false;
        hasvisited[i][j] = true;
        for (int[] d : direction) {
            if(dfs(k + 1, hasvisited, board, i + d[0], j + d[1], word))
                return true;
        } 
        hasvisited[i][j] = false;
        return false;
    }

}