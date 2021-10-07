// @algorithm @lc id=100287 lang=java 
// @title shu-de-zi-jie-gou-lcof


package ____Offer_26________LCOF;
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
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A == null || B == null) return false;
        return isSubtreeWithRoot(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean isSubtreeWithRoot(TreeNode a, TreeNode b) {
        if(b == null) return true;
        if(a == null) return false;
        if(a.val != b.val) return false;
        return isSubtreeWithRoot(a.left, b.left) && isSubtreeWithRoot(a.right, b.right);
    }
}