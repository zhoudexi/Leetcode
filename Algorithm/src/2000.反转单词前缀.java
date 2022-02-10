/*
 * @lc app=leetcode.cn id=2000 lang=java
 *
 * [2000] 反转单词前缀
 */

// @lc code=start
class Solution {
    public String reversePrefix(String word, char ch) {
        char[] cs = word.toCharArray();
        int n = cs.length, idx = -1;
        for (int i = 0; i < n && idx == -1; i++) {
            if (cs[i] == ch) idx = i;
        }
        int l = 0, r = idx;
        while (l < r) {
            char c = cs[l];
            cs[l++] = cs[r];
            cs[r--] = c;
        }
        return String.valueOf(cs);
        

    }
}

// @lc code=end

