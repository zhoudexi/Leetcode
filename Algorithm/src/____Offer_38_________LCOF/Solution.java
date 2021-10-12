// @algorithm @lc id=100308 lang=java 
// @title zi-fu-chuan-de-pai-lie-lcof


package ____Offer_38_________LCOF;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    ArrayList<String> list = new ArrayList<>();
    public String[] permutation(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        dfs(c, new boolean[c.length], new StringBuilder());
        return list.toArray(new String[list.size()]);
    }
    private void dfs(char[] c, boolean[] bs, StringBuilder stringBuilder) {
        if(stringBuilder.length() == c.length){
            list.add(stringBuilder.toString());
            return;
        }
        for (int i = 0; i < c.length; i++) {
            if(bs[i]) continue;
            if(i != 0 && c[i] == c[i - 1] && !bs[i - 1]) continue;
            bs[i] = true;
            stringBuilder.append(c[i]);
            dfs(c, bs, stringBuilder);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            bs[i] = false;
        }
    }   
}