/*
 * @lc app=leetcode.cn id=504 lang=java
 *
 * [504] 七进制数
 */

// @lc code=start
class Solution {
    public String convertToBase7(int num) {
        if(num == 0){
            return "0";
        }
        boolean b = num < 0;
        num = Math.abs(num);
        StringBuffer s = new StringBuffer();
        while(num != 0){
            s.append(num % 7);
            num /= 7;
        }
        if(b){
            s.append("-");
        }
        return s.reverse().toString();
    }
}
// @lc code=end

