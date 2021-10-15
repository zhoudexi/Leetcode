// @algorithm @lc id=100309 lang=java 
// @title 1nzheng-shu-zhong-1chu-xian-de-ci-shu-lcof


package ____Offer_43_1_n___1_______LCOF;
public class Solution {
    public int countDigitOne(int n) {
        int digit = 1, res = 0;
        int hight = n / 10, cur = n % 10, low = 0;
        while(hight != 0 || cur != 0){
            if(cur == 0) res += hight * digit;
            else if(cur == 1) res += hight * digit + low + 1;
            else res += (hight + 1) * digit;
            low += cur * digit;
            cur = hight % 10;
            hight /= 10;
            digit *= 10;
        }
        return res;
    }
}