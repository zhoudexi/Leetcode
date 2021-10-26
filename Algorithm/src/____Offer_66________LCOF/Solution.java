// @algorithm @lc id=100338 lang=java 
// @title gou-jian-cheng-ji-shu-zu-lcof


package ____Offer_66________LCOF;
public class Solution {
    public int[] constructArr(int[] a) {
        int[] b = new int[a.length];
        if(a.length == 0) return new int[0];
        int tmp = 1;
        b[0] = 1;
        for (int i = 1; i < a.length; i++) b[i] = b[i - 1] * a[i - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            tmp *= a[i + 1];
            b[i] *= tmp;
        }
        return b;
    }
}