import java.util.Arrays;
import java.util.Comparator;

/*
 * @lc app=leetcode.cn id=452 lang=java
 *
 * [452] 用最少数量的箭引爆气球
 */

// @lc code=start
class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0) return 0;
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] > o2[1]) return 1;
                else if(o1[1] < o2[1]) return -1;
                else return 0;
            }
        });
        int pos = points[0][1];
        int ans = 1;
        for (int[] is : points) {
            if(is[0] > pos){
                pos = is[1];
                ans++;
            }
        }
        return ans;
    }
}
// @lc code=end

