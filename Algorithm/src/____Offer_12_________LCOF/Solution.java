// @algorithm @lc id=100279 lang=java 
// @title ju-zhen-zhong-de-lu-jing-lcof


package ____Offer_12_________LCOF;
public class Solution {
    private int m, n;
    private int[][] next = {{0,1},{1,0},{-1,0},{0,-1}}; 
    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        char[] words = word.toCharArray();
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(dfs(board, i, j, 0, words, visited))
                    return true;
            }
        }
        return false;
    }
    private boolean dfs(char[][] board, int i, int j, int k, char[] words, boolean[][] visited) {
        if(k == words.length - 1) return true;
        if(i >= m || i < 0 || j >= n || j < 0 || board[i][j] != words[k] || visited[i][j]) return false;
        visited[i][j] = true;
        for(int[] d : next){
            if(dfs(board, i + d[0], j + d[1], k + 1, words, visited)) return true;
        }
        visited[i][j] = false;
        return false;
    }
}