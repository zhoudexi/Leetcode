/*
 * @lc app=leetcode.cn id=1816 lang=java
 *
 * [1816] 截断句子
 */

// @lc code=start
class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = 0, cnt = 0; i < n && cnt < k; i++) {
            char c = s.charAt(i);
            if (c == ' ') cnt++;
            if (cnt < k) sb.append(c);
        }
        return sb.toString();
    }
}

// @lc code=end

