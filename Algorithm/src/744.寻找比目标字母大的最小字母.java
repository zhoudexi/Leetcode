/*
 * @lc app=leetcode.cn id=744 lang=java
 *
 * [744] 寻找比目标字母大的最小字母
 */

// @lc code=start
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0, r = letters.length - 1;
        while(l < r){
            int m = l + (r - l) / 2;
            if(letters[m] > target) r = m;
            else l = m + 1;
        }
        return letters[l % letters.length];
    }
}
// @lc code=end

