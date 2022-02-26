/*
 * @lc app=leetcode.cn id=2016 lang=java
 *
 * [2016] 增量元素之间的最大差值
 */

// @lc code=start
class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int max = -1, permin = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] > permin) {
                max = Math.max(max, nums[i] - permin);
            }else{
                permin = nums[i];
            }
        }
        return max;
    }
}
// @lc code=end

