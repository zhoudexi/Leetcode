/*
 * @lc app=leetcode.cn id=537 lang=java
 *
 * [537] 复数乘法
 */

// @lc code=start
class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] s1 = num1.split("\\+|i"), s2 = num2.split("\\+|i");
        int a = Integer.parseInt(s1[0]), b = Integer.parseInt(s1[1]);
        int c = Integer.parseInt(s2[0]), d = Integer.parseInt(s2[1]);
        int A = a * c - b * d, B = b * c + a * d;
        return A + "+" + B + "i";
    }
}
// @lc code=end

