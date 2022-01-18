/*
 * @lc app=leetcode.cn id=539 lang=java
 *
 * [539] 最小时间差
 */

// @lc code=start
class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size() * 2;
        int[] nums = new int[n];
        for (int i = 0, idx = 0; i < n / 2; i++, idx += 2) {
            String[] ss = timePoints.get(i).split(":");
            int h = Integer.parseInt(ss[0]), m = Integer.parseInt(ss[1]);
            nums[idx] = h * 60 + m;
            nums[idx + 1] = nums[idx] + 1440;
        }
        Arrays.sort(nums);
        int ans = nums[1] - nums[0];
        for (int i = 0; i < n - 1; i++) ans = Math.min(ans, nums[i + 1] - nums[i]);
        return ans;
    }
}
// @lc code=end

