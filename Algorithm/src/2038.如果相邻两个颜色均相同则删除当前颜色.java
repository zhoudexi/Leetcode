/*
 * @lc app=leetcode.cn id=2038 lang=java
 *
 * [2038] 如果相邻两个颜色均相同则删除当前颜色
 */

// @lc code=start
class Solution {
    public boolean winnerOfGame(String colors) {
        char[] c = colors.toCharArray();
        int n = colors.length();
        int a = 0, b = 0;
        for(int i = 1; i < n - 1; i++){
            if(c[i] == 'A' && c[i - 1] == 'A' && c[i + 1] == 'A') a++;
            if(c[i] == 'B' && c[i - 1] == 'B' && c[i + 1] == 'B') b++;
        }
        return a > b;
    }
}
// @lc code=end

