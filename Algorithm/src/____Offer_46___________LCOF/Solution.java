// @algorithm @lc id=100325 lang=java 
// @title ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof


package ____Offer_46___________LCOF;
public class Solution {
    public int translateNum(int num) {
        int a = 1, b = 1, x, y = num % 10;
        while(num != 0){
            num /= 10;
            x = num % 10;
            int tmp = 10 * x + y;
            int c = (tmp >= 10 && tmp <= 25) ? a + b : a;
            b = a;
            a = c;
            y = x; 
        }
        return a;
    }
}