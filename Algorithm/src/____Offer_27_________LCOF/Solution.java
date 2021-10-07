// @algorithm @lc id=100288 lang=java 
// @title er-cha-shu-de-jing-xiang-lcof


package ____Offer_27_________LCOF;
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
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) return null;
        TreeNode leftNode = mirrorTree(root.right);
        TreeNode rightNode = mirrorTree(root.left);
        root.left = leftNode;
        root.right = rightNode;
        return root;
    }
}