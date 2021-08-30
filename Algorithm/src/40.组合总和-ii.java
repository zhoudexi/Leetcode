import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=40 lang=java
 *
 * [40] 组合总和 II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> combination = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(0, combination, new ArrayList<>(), candidates, target);
        return combination;
    }

    private void backtracking(int k, List<List<Integer>> combination, List<Integer> arrayList, int[] candidates, int target) {
        if(target == 0){
            combination.add(new ArrayList<>(arrayList));
            return;
        }
        for (int i = k; i < candidates.length; i++) {           //大剪枝   
            if(target - candidates[i] < 0)
                break;
            if(i > k && candidates[i] == candidates[i - 1])     //小剪枝
                continue;
            arrayList.add(candidates[i]);
            backtracking(i + 1, combination, arrayList, candidates, target - candidates[i]);
            arrayList.remove(arrayList.size() - 1);
        }
    }
}
// @lc code=end

