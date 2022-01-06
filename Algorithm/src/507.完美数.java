/*
 * @lc app=leetcode.cn id=507 lang=java
 *
 * [507] 完美数
 */

// @lc code=start
class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num == 1) return false;
        int sum = 1;
        for (int i = 2; i <= num / i; i++) {
            if(num % i == 0){   
                sum += i;
                if(i * i != num) sum += num / i;
            }
        }
        return num == sum;
    }
}
// @lc code=end

