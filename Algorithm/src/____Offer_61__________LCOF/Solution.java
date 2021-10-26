// @algorithm @lc id=100341 lang=java 
// @title bu-ke-pai-zhong-de-shun-zi-lcof


package ____Offer_61__________LCOF;

import java.util.Arrays;

public class Solution {
    public boolean isStraight(int[] nums) {
        int j = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) j++;
            else if(nums[i] == nums[i + 1]) return false;
        }
        return nums[4] - nums[j] < 5;
    }
}