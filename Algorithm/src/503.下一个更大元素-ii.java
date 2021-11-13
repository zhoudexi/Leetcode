import java.util.Arrays;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=503 lang=java
 *
 * [503] 下一个更大元素 II
 */

// @lc code=start
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n * 2; i++){
            int num = nums[i % n];
            while(!stack.empty() && nums[stack.peek()] < num) res[stack.pop()] = num;
            if(i < n) stack.push(i);
        } 
        return res;
    }
}
// @lc code=end

