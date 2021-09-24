import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=653 lang=java
 *
 * [653] 两数之和 IV - 输入 BST
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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> num = new ArrayList<>();
        inOrder(root, num);
        int i = 0, j = num.size() - 1;
        while(i < j){
            int sum = num.get(i) + num.get(j);
            if(sum == k) return true;
            if(sum < k) i++;
            else j--;
        }
        return false;
    }

    private void inOrder(TreeNode root, List<Integer> num) {
        if(root == null) return;
        inOrder(root.left, num);
        num.add(root.val);
        inOrder(root.right, num);
    }
}
// @lc code=end

