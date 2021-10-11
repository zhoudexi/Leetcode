// @algorithm @lc id=100317 lang=java 
// @title er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof


package ____Offer_34______________LCOF;
import java.util.ArrayList;
import java.util.List;

import algm.*;
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
public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        recur(root, target);
        return res;
    }
    private void recur(TreeNode root, int target) {
        if(root == null) return;
        path.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null) res.add(new ArrayList<>(path));
        recur(root.left, target);
        recur(root.right, target);
        path.remove(path.size() - 1);
    }
}