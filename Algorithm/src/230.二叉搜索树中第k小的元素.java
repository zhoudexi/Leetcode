/*
 * @lc app=leetcode.cn id=230 lang=java
 *
 * [230] 二叉搜索树中第K小的元素
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
    private int cut = 0;
    private int val;
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root,k);
        return val;
    }
    private void inOrder(TreeNode root, int k) {
        if(root == null) return;
        inOrder(root.left, k);
        cut++;
        if(cut == k){
            val = root.val;
            return;
        }
        inOrder(root.right, k);
    }
}
// @lc code=end

