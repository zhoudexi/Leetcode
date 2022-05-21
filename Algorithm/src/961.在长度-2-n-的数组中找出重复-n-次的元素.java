/*
 * @lc app=leetcode.cn id=961 lang=java
 *
 * [961] 在长度 2N 的数组中找出重复 N 次的元素
 */

// @lc code=start
class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> found = new HashSet<Integer>();
        for (int num : nums) {
            if (!found.add(num)) {
                return num;
            }
        }
        // 不可能的情况
        return -1;
    }
}

// @lc code=end

