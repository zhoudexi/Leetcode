/*
 * @lc app=leetcode.cn id=1823 lang=java
 *
 * [1823] 找出游戏的获胜者
 */

// @lc code=start
class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> queue = new ArrayDeque<Integer>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        while (queue.size() > 1) {
            for (int i = 1; i < k; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        return queue.peek();
    }
}

// @lc code=end

