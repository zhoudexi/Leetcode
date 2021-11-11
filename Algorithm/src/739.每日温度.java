import java.util.Stack;

/*
 * @lc app=leetcode.cn id=739 lang=java
 *
 * [739] 每日温度
 */

// @lc code=start
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while(!stack.empty() && temperatures[i] > temperatures[stack.peek()]){
                int j = stack.pop();
                res[j] = i - j;
            }
            stack.add(i);
        }
        return res;
    }
}
// @lc code=end

