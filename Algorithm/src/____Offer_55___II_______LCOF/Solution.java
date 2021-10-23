// @algorithm @lc id=100342 lang=java 
// @title ping-heng-er-cha-shu-lcof


package ____Offer_55___II_______LCOF;
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
    private boolean isBalanced = false;
    public boolean isBalanced(TreeNode root) {
        recur(root);
        return isBalanced;
    }
    private int recur(TreeNode root) {
        if(root == null) return 0;
        int l = recur(root.left);
        int r = recur(root.right);
        if(Math.abs(l - r) == 1) isBalanced = true;
        return 1 + Math.max(l, r); 
    }
}