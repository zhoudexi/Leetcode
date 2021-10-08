// @algorithm @lc id=100289 lang=java 
// @title dui-cheng-de-er-cha-shu-lcof


package ____Offer_28_________LCOF;
import algm.*;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : recur(root.left, root.right);
    }

    private boolean recur(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.val != right.val) return false;
        return recur(left.left, right.right) && recur(left.right, right.left);
    }
}