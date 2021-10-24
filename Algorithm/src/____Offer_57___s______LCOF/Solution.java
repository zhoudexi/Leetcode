// @algorithm @lc id=100322 lang=java 
// @title he-wei-sde-liang-ge-shu-zi-lcof


package ____Offer_57___s______LCOF;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while(l < r){
            if(target - nums[l] > nums[r]) r--;
            else if(target - nums[l] < nums[r]) l++;
            else return new int[] { nums[l], nums[r] };
        }
        return new int[]{0};
    }
}