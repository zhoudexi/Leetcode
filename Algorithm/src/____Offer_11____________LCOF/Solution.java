// @algorithm @lc id=100278 lang=java 
// @title xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof


package ____Offer_11____________LCOF;
public class Solution {
    public int minArray(int[] numbers) {
        int l = 0, r = numbers.length;
        while(l < r){
            int m = l + (r - 1)/2;
            if(numbers[m] <= numbers[r])
                r = m;
            else
                l = m + 1;
        }
        return numbers[l];
    }
}