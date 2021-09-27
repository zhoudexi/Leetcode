// @algorithm @lc id=100276 lang=java 
// @title er-wei-shu-zu-zhong-de-cha-zhao-lcof


package ____Offer_04__________LCOF;
public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix[0].length == 0 || matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0,c = n - 1;
        while(r <= m - 1 && c >=0){
            if(matrix[r][c] == target) return true;
            else if(matrix[r][c] > target) c--;
            else r++;
        } 
        return false;
    }
}