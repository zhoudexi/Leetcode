/*
 * @lc app=leetcode.cn id=917 lang=java
 *
 * [917] 仅仅反转字母
 */

// @lc code=start
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] c = s.toCharArray();
        int n = c.length;
        for (int i = 0, j = n - 1; i < j;) {
            while (i < j && !Character.isLetter(c[i])) i++;
            while (i < j && !Character.isLetter(c[j])) j--;
            if (i < j) {
                char cc = c[i];
                c[i++] = c[j];
                c[j--] = cc;
            }
        }
        return String.valueOf(c);
    }
}
// @lc code=end

