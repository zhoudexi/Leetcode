// @algorithm @lc id=100332 lang=java 
// @title zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof


package ____Offer_48_______________LCOF;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int res = 0, tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = dic.getOrDefault(s.charAt(i), -1);
            dic.put(s.charAt(i), i);
            tmp = tmp < i - j ? tmp + 1 : i - j;
            res = Math.max(res, tmp);
        }
        return res;
    }
}