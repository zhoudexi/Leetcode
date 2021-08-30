/*
 * @lc app=leetcode.cn id=47 lang=java
 *
 * [47] 全排列 II
 */
import java.util.*;
// @lc code=start
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> permute = new ArrayList<>();
        List<Integer> permutelist = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        backtracking(visited, permute, permutelist, nums);
        return permute;
    }

    private void backtracking(boolean[] visited, List<List<Integer>> permute, List<Integer> permutelist, int[] nums) {
        if(permutelist.size() == nums.length){
            permute.add(new ArrayList<>(permutelist));
            return;
        }
        for (int i = 0; i < visited.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
                continue;  
            }
            if (visited[i]){
                continue;
            }
            visited[i] = true;
            permutelist.add(nums[i]);
            backtracking(visited, permute, permutelist, nums);
            permutelist.remove(permutelist.size() - 1);
            visited[i] = false;
        }
    }
}
// @lc code=end

