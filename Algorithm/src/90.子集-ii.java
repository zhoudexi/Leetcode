import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=90 lang=java
 *
 * [90] 子集 II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> subsetslList = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length; i++) {
            backtracking(false, subsets, subsetslList, i, 0, nums);
        }
        return subsets;
    }

    private void backtracking(boolean b, List<List<Integer>> subsets, List<Integer> subsetslList, int k, int start, int[] nums) {
        if(subsetslList.size() == k){
            subsets.add(new ArrayList<>(subsetslList));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if(i != 0 && nums[i] == nums[i - 1] && !b)
                continue;
            subsetslList.add(nums[i]);
            backtracking(true, subsets, subsetslList, k, i + 1, nums);
            b = false;
            subsetslList.remove(subsetslList.size() - 1);
        }
    }
}
// @lc code=end

