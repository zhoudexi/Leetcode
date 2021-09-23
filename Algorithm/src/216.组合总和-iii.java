import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=216 lang=java
 *
 * [216] 组合总和 III
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> combination = new ArrayList<>();
        backtracking(1, new ArrayList<>(), combination, k, n);
        return combination;
    }

    private void backtracking(int start, List<Integer> arrayList, List<List<Integer>> combination, int k, int n) {
        if(arrayList.size() == k && n == 0){
            combination.add(new ArrayList<>(arrayList));
            return;
        }
        if(arrayList.size() == k || n == 0)
            return;
        for (int i = start; i <= 9; i++) {
            arrayList.add(i);
            backtracking(i + 1, arrayList, combination, k, n - i);
            arrayList.remove(arrayList.size() - 1);
        }
    }
}
// @lc code=end

