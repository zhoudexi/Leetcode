/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if(x <= 1) return x;
        int l = 0, r = x;
        while(l <= r){
            int m = l + (r - l) / 2;
            int sqrt = x / m;
            if(m == sqrt) return m;
            else if(m > sqrt) r = m - 1;
            else l = m + 1;
        }
        return r;
    }
}
// @lc code=end

