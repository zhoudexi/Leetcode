// @algorithm @lc id=100344 lang=java 
// @title gu-piao-de-zui-da-li-run-lcof


package ____Offer_63__________LCOF;
public class Solution {
    public int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE, profit = 0;
        for (int i : prices) {
            cost = Math.min(cost, i);
            profit = Math.max(profit, i - cost);
        }
        return profit;
    }
}