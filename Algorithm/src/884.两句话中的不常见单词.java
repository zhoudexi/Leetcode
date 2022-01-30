/*
 * @lc app=leetcode.cn id=884 lang=java
 *
 * [884] 两句话中的不常见单词
 */

// @lc code=start
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        count(s1, map);
        count(s2, map);

        List<String> list = new ArrayList<>();
        map.forEach((k, v) -> {
            if (v == 1) {
                list.add(k);
            }
        });

        return list.toArray(new String[list.size()]);
    }

    private void count(String s, Map<String, Integer> map) {
        for (String a : s.split(" ")) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
    }
}
// @lc code=end

