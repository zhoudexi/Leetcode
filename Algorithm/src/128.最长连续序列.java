import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=128 lang=java
 *
 * [128] 最长连续序列
 */

// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int length = 0;
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            if(!set.contains(num - 1)){
                int curnum = num;
                int curlen = 1;
                while(set.contains(curnum + 1)){
                    curnum += 1;
                    curlen += 1;
                }
                length = Math.max(length, curlen);
            }
        }
        return length;
    }
}
// @lc code=end

