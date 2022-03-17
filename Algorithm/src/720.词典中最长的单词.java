/*
 * @lc app=leetcode.cn id=720 lang=java
 *
 * [720] 词典中最长的单词
 */

// @lc code=start
class Solution {
    public String longestWord(String[] words) {
        String ans = "";
        Set<String> set = new HashSet<>();
        for (String s : words) set.add(s);
        for (String s : set) {
            int n = s.length(), m = ans.length();
            if (n < m) continue;
            if (n == m && s.compareTo(ans) > 0) continue;
            boolean ok = true;
            for (int i = 1; i <= n && ok; i++) {
                String sub = s.substring(0, i);
                if (!set.contains(sub)) ok = false;
            }
            if (ok) ans = s;
        }
        return ans;
    }
}

// @lc code=end

