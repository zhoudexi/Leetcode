import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinnation = new ArrayList<>();
        List<Integer> combinnationlList = new ArrayList<>();
        backtracking(candidates,target,combinnation,0,combinnationlList);
        return combinnation;
    }

    private void backtracking(int[] candidates, int target, List<List<Integer>> combinnation,
            int k, List<Integer> combinnationlList) {
        if(target == 0){
            combinnation.add(new ArrayList<>(combinnationlList));
            return;
        }
        for (int i = k; i < candidates.length; i++) {
            if(candidates[i] <= target){
                combinnationlList.add(candidates[i]);
                backtracking(candidates, target - candidates[i], combinnation, i, combinnationlList);
                combinnationlList.remove(combinnationlList.size() - 1);
            }
        }
    }
}
// @lc code=end

