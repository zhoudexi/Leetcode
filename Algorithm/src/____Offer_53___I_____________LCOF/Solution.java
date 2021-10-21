// @algorithm @lc id=100329 lang=java 
// @title zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof


package ____Offer_53___I_____________LCOF;
public class Solution {
    public int search(int[] nums, int target) {
        //右边界
        int l = 0, r = nums.length - 1;
        while(l <= r){
            int m = (l + r) >> 2;
            if(nums[m] <= target) l = m + 1;
            else r = m - 1;
        }
        int right = l;
        if(r >= 0 && nums[r] != target) return 0;
        //左边界
        l = 0; r = nums.length - 1;
        while(l <= r){
            int m = (l + r) >> 2;
            if(nums[m] < target) l = m + 1;
            else r = m - 1;
        }
        int left = r;
        return right - left - 1;
    }
}