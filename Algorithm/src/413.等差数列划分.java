import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=413 lang=java
 *
 * [413] 等差数列划分
 */

// @lc code=start
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int ans = 0;
        int n = nums.length;
        if(n == 1)
            return 0;
        int d = nums[0] - nums[1],t = 0;
        for (int i = 2; i < n; i++) {
            if(d == nums[i - 1] - nums[i]){
                ++t;
            }else{
                d = nums[i - 1] - nums[i];
                t = 0;
            }
            ans += t;
        }
        return ans;
    }
}
// @lc code=end

