// @algorithm @lc id=100320 lang=java 
// @title shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof


package ____Offer_56___I____________LCOF;
public class Solution {
    public int[] singleNumbers(int[] nums) {
        int x = 0, y = 0, n = 0, m = 1;
        for (int i : nums) n ^= i;
        while((n & m) == 0) m <<= 1;
        for (int i : nums) {
            if((i & m) != 0) x ^= i;
            else y ^= i;
        }
		return new int[]{x, y};
    }
}