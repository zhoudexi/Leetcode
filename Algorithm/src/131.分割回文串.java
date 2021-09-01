import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=131 lang=java
 *
 * [131] 分割回文串
 */

// @lc code=start
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> partition = new ArrayList<>();
        List<String> partitionlList = new ArrayList<>();
        backtracking(partition, partitionlList, s, 0);
        return partition;
    }

    private void backtracking(List<List<String>> partition, List<String> partitionlList, String s, int k) {
        if(s.length() == 0){
            partition.add(new ArrayList<>(partitionlList));
            return;
        }
        for (int i = k; i < s.length(); i++) {
            if(isPalindrome(s, 0, i)){
                partitionlList.add(s.substring(0, i + 1));
                backtracking(partition, partitionlList, s.substring(i + 1), k);
                partitionlList.remove(partitionlList.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int i, int i2) {
        while(i < i2){
            if(s.charAt(i++) != s.charAt(i2--)){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

