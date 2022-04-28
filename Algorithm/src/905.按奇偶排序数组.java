 /*
 * @lc app=leetcode.cn id=905 lang=java
 *
 * [905] 按奇偶排序数组
 */

// @lc code=start
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length, index = 0;
        int[] res = new int[n];
        for (int num : nums) {
            if (num % 2 == 0) {
                res[index++] = num;
            }
        }
        for (int num : nums) {
            if (num % 2 == 1) {
                res[index++] = num;
            }
        }
        return res;
    }
}

// @lc code=end

