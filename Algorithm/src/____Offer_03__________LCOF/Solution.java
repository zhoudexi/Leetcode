// @algorithm @lc id=100275 lang=java 
// @title shu-zu-zhong-zhong-fu-de-shu-zi-lcof


package ____Offer_03__________LCOF;
public class Solution {
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while(i != nums[i]){
                if(nums[i] == nums[nums[i]])
                    return nums[i];
                swap(nums, i, nums[i]);
            }
            swap(nums, i, nums[i]);
        }
        return -1;
    }
    private void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = j;
        nums[j] = t;
    }
}