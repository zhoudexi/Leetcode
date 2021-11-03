import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=406 lang=java
 *
 * [406] 根据身高重建队列
 */

// @lc code=start
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b)->{
            if(a[0] == b[0]) return a[1] - b[1];
            return b[0] - a[0];
        });
        LinkedList<int[]> que = new LinkedList<>();
        for (int[] is : people) {
            que.add(is[1], is);
        }
        return que.toArray(new int[people.length][]);
    }
}
// @lc code=end

