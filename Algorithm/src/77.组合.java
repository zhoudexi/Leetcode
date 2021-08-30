import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combine = new ArrayList<>();
        List<Integer> combineList = new ArrayList<>();
        backtracking(1, combine, combineList, n, k);
        return combine;
    }

    private void backtracking(int start, List<List<Integer>> combine, List<Integer> combineList, int n, int k) {
        if(combineList.size() ==  k){
            combine.add(new ArrayList<>(combineList));
            return;
        }
        for (int i = start; i <= n - (k - combineList.size()) + 1; i++) {
                combineList.add(i);
                backtracking(i + 1, combine, combineList, n, k);
                combineList.remove(combineList.size() - 1);
        }
    }
}
// @lc code=end

