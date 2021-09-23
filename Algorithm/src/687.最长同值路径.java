/*
 * @lc app=leetcode.cn id=687 lang=java
 *
 * [687] 最长同值路径
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int path = 0;
    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return path;
    }
    private int dfs(TreeNode root) {
        if(root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        int leftpath = root.left != null && root.left.val == root.val ? left + 1 : 0;
        int rightpath = root.right != null && root.right.val == root.val ? right + 1 : 0;
        path = Math.max(path, leftpath + rightpath);
        return Math.max(leftpath, rightpath);
    }
}
// @lc code=end

