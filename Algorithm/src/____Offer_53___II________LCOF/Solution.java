// @algorithm @lc id=100331 lang=java 
// @title que-shi-de-shu-zi-lcof


package ____Offer_53___II________LCOF;
public class Solution {
    public int missingNumber(int[] nums) {
        int l = 0, r = nums.length - 1;
        while(l <= r){
            int m = (l + r) / 2;
            if(nums[m] == m) l = m + 1;
            else r = m - 1;
        }
        return l;
    }
}