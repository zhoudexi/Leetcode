/*
 * @lc app=leetcode.cn id=1996 lang=java
 *
 * [1996] 游戏中弱角色的数量
 */

// @lc code=start
class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (o1, o2) -> {
            return o1[0] == o2[0] ? (o1[1] - o2[1]) : (o2[0] - o1[0]);
        });
        int maxDef = 0;
        int ans = 0;
        for (int[] p : properties) {
            if (p[1] < maxDef) {
                ans++;
            } else {
                maxDef = p[1];
            }
        }
        return ans;
    }
}
// @lc code=end

