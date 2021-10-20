// @algorithm @lc id=100316 lang=java 
// @title di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof


package ____Offer_50______________LCOF;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public char firstUniqChar(String s) {
        Map<Character, Boolean> map = new LinkedHashMap<>();
        char[] c = s.toCharArray();
        for (char i : c) {
            map.put(i, !map.containsKey(i));
        }
        for(Map.Entry<Character, Boolean> d : map.entrySet()){
            if(d.getValue()) return d.getKey();
        }
        return ' ';
    }
}