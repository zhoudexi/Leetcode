/*
 * @lc app=leetcode.cn id=437 lang=java
 *
 * [437] 路径总和 III
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
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        int count = pathSumStartWithRoot(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
        return count;
    }

    private int pathSumStartWithRoot(TreeNode root, int targetSum) {
        if(root == null) return 0;
        int count = 0;
        if(root.val == targetSum) count++;
        count += pathSumStartWithRoot(root.left, targetSum - root.val) + pathSumStartWithRoot(root.right, targetSum - root.val);
        return count;
    }
}
// @lc code=end

