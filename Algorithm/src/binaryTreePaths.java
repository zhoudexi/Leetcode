import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> path = new ArrayList<>();
        if(root == null)
            return path;
        List<Integer> value = new ArrayList<>();
        backtracking(root,path,value);
        return path;
    }

    private void backtracking(TreeNode root, List<String> path, List<Integer> value) {
        if(root == null)
            return;
        value.add(root.val);
    }
}