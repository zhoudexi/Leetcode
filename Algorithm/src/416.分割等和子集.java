/*
 * @lc app=leetcode.cn id=416 lang=java
 *
 * [416] 分割等和子集
 */

// @lc code=start
class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        if(nums[0] <= target)
            return true;
        for (int i = 1; i < nums.length; i++) {
            for (int j = target; nums[i] <= j ; j--) {
                if(dp[target])
                    return true;
                dp[j] = dp[j] || dp[j - nums[i]];
            }
        }
        return dp[target];
    }
}
// @lc code=end

