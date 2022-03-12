/*
 * @lc app=leetcode.cn id=590 lang=java
 *
 * [590] N 叉树的后序遍历
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        re(root, list);
        return list;
    }
    public void re(Node root, List<Integer> list) {
        if(root == null){
            return;
        }
        for (Node ch : root.children) {
            re(ch, list);
        }
        list.add(root.val);
    }
}
// @lc code=end

