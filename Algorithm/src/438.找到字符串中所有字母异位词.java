import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=438 lang=java
 *
 * [438] 找到字符串中所有字母异位词
 */

// @lc code=start
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length(), m = p.length();
        List<Integer> res = new ArrayList<>();
        if(n < m) return res;
        int[] pcnt = new int[26];
        int[] scnt = new int[26];
        for (int i = 0; i < m; i++) {
            pcnt[p.charAt(i) - 'a']++;
        }
        int l = 0;
        for (int r = 0; r < n; r++) {
            int curr = s.charAt(r) - 'a';
            scnt[curr]++;
            while(scnt[curr] > pcnt[curr]){
                int curl = s.charAt(l) - 'a';
                scnt[curl]--;
                l++;
            }
            if(r - l + 1 == m)
                res.add(l);
        }
        return res;
    }
}
// @lc code=end

