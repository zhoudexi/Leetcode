// @algorithm @lc id=100321 lang=java 
// @title shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-ii-lcof


package ____Offer_56___II____________II_LCOF;
public class Solution {
    public int singleNumber(int[] nums) {
        int one = 0, two = 0;
        for (int i : nums) {
            one = one ^ i & ~two;
            two = two ^ i & ~one;
        }
        return one;
    }
}