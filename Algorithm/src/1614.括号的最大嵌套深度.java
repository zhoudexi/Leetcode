/*
 * @lc app=leetcode.cn id=1614 lang=java
 *
 * [1614] 括号的最大嵌套深度
 */

// @lc code=start
class Solution {
    public int maxDepth(String s) {
        int n = s.length(), ans = 0;
        for (int i = 0, cnt = 0; i < n; i++) {
            if (s.charAt(i) == '(') cnt++;
            else if (s.charAt(i) == ')') cnt--;
            ans = Math.max(ans, cnt);
        }
        return ans;
    }
}
// @lc code=end

