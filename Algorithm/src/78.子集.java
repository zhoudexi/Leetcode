import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> subsetslList = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            backtracking(subsets, subsetslList, nums, 0, i);
        }
        return subsets;
    }

    private void backtracking(List<List<Integer>> subsets, List<Integer> subsetslList, int[] nums, int start, int k) {
        if(subsetslList.size() == k){
            subsets.add(new ArrayList<>(subsetslList));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            subsetslList.add(nums[i]);
            backtracking(subsets, subsetslList, nums, i + 1, k);
            subsetslList.remove(subsetslList.size() - 1);
        }
    }
}
// @lc code=end

