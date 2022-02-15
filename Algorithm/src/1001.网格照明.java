/*
 * @lc app=leetcode.cn id=1001 lang=java
 *
 * [1001] 网格照明
 */

// @lc code=start
class Solution {
    int[][] dirs = new int[][]{{0,0},{0,-1},{0,1},{-1,0},{-1,-1},{-1,1},{1,0},{1,-1},{1,1}};
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        long N = n;
        Map<Integer, Integer> row = new HashMap<>(), col = new HashMap<>();
        Map<Integer, Integer> left = new HashMap<>(), right = new HashMap<>();
        Set<Long> set = new HashSet<>();
        for (int[] l : lamps) {
            int x = l[0], y = l[1];
            int a = x + y, b = x - y;
            if (set.contains(x * N + y)) continue;
            increment(row, x); increment(col, y);
            increment(left, a); increment(right, b);
            set.add(x * N + y);
        }
        int m = queries.length;
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            int[] q = queries[i];
            int x = q[0], y = q[1];
            int a = x + y, b = x - y;
            if (row.containsKey(x) || col.containsKey(y) || left.containsKey(a) || right.containsKey(b)) ans[i] = 1;

            for (int[] d : dirs) {
                int nx = x + d[0], ny = y + d[1];
                int na = nx + ny, nb = nx - ny;
                if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                if (set.contains(nx * N + ny)) {
                    set.remove(nx * N + ny);
                    decrement(row, nx); decrement(col, ny);
                    decrement(left, na); decrement(right, nb);
                }
            }
        }
        return ans;
    }
    void increment(Map<Integer, Integer> map, int key) {
        map.put(key, map.getOrDefault(key, 0) + 1);
    }
    void decrement(Map<Integer, Integer> map, int key) {
        if (map.get(key) == 1) map.remove(key);
        else map.put(key, map.get(key) - 1);
    }
}
// @lc code=end

