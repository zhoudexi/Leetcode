/*
 * @lc app=leetcode.cn id=473 lang=java
 *
 * [473] 火柴拼正方形
 */

// @lc code=start
class Solution {
    int[] ms;
    int t;
    public boolean makesquare(int[] _ms) {
        ms = _ms;
        int sum = 0;
        for (int i : ms) sum += i;
        t = sum / 4;
        if (t * 4 != sum) return false;
        Arrays.sort(ms);
        return dfs(ms.length - 1, new int[4]);
    }
    boolean dfs(int idx, int[] cur) {
        if (idx == -1) return true;
        out:for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                if (cur[j] == cur[i]) continue out;
            }
            int u = ms[idx];
            if (cur[i] + u > t) continue;
            cur[i] += u;
            if (dfs(idx - 1, cur)) return true;
            cur[i] -= u;
        }
        return false;
    }
}

// @lc code=end

