// @algorithm @lc id=100328 lang=java 
// @title fan-zhuan-dan-ci-shun-xu-lcof


package ____Offer_58___I________LCOF;
public class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int j = s.length() - 1, i = j;
        StringBuilder stringBuilder = new StringBuilder();
        while(i >= 0){
            while(i >= 0 && s.charAt(i) != ' ') i--;
            stringBuilder.append(s.substring(i + 1, j + 1) + " ");
            while(i >= 0 && s.charAt(i) == ' ') i--;
            j = i;
        }
        return stringBuilder.toString().trim();
    }
}