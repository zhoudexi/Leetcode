// @algorithm @lc id=100343 lang=java 
// @title yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof


package ____Offer_62____________LCOF;
public class Solution {
    public int lastRemaining(int n, int m) {
        int ans = 0;
        for (int i = 2; i <= n; i++) ans = (ans + m) % i;
        return ans;
    }
}