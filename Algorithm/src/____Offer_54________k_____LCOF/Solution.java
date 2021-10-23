// @algorithm @lc id=100333 lang=java 
// @title er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof


package ____Offer_54________k_____LCOF;
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
    private int count = 0, res;
    public int kthLargest(TreeNode root, int k) {
        dfs(root, k);
        return res;
    }
    private void dfs(TreeNode root,int k) {
        if(root == null) return;
        dfs(root.right, k);
        count++;
        if(count == k) res = root.val;
        dfs(root.left, k);
    }
}