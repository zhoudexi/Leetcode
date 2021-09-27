// @algorithm @lc id=100280 lang=java 
// @title ti-huan-kong-ge-lcof


package ____Offer_05______LCOF;
public class Solution {
    public String replaceSpace(String s) {
        StringBuffer s1 = new StringBuffer();
        for (Character c : s.toCharArray()) {
            s1.append(c);
        }
        int l1 = s1.length() - 1;
        for (int i = 0; i <= l1; i++) 
            if(s1.charAt(i) == ' ')
                s1.append("  ");
        int l2 = s1.length() - 1;
        while(l1 >= 0 && l2 > l1){
            char c = s1.charAt(l1--);
            if(c == ' '){
                s1.setCharAt(l2--, '0');
                s1.setCharAt(l2--, '2');
                s1.setCharAt(l2--, '%');
            }else
                s1.setCharAt(l2--, c);

        }
		return s1.toString();
    }
}