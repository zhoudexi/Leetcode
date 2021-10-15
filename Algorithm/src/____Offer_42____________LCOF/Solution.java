// @algorithm @lc id=100304 lang=java 
// @title lian-xu-zi-shu-zu-de-zui-da-he-lcof


package ____Offer_42____________LCOF;
public class Solution {
    public int maxSubArray(int[] nums) {
        int former = 0, cur = 0, max = nums[0];
        for (int i : nums) {
            cur = i;
            if(former > 0) cur += former;
            if(cur > max) max = cur;
            former = cur;
        }
        return max;
    }
}