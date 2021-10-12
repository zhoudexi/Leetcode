// @algorithm @lc id=100310 lang=java 
// @title shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof


package ____Offer_39_________________LCOF;
public class Solution {
    public int majorityElement(int[] nums) {
        int votes = 0, x = 0, count = 0;
        for (int i : nums) {
            if(votes == 0) x = i;
            votes += i == x ? 1 : -1;
        }
        for (int i : nums) 
            if(i == x) count++;
        return count > nums.length >> 1 ? x : 0;
    }
}