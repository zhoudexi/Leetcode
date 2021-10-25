// @algorithm @lc id=100336 lang=java 
// @title hua-dong-chuang-kou-de-zui-da-zhi-lcof


package ____Offer_59___I__________LCOF;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0) return new int[]{};
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        int index = 0;
        for (int i = 0; i < k; i++) {
            while(!deque.isEmpty() && nums[i] > deque.peekLast()) deque.removeLast();
            deque.addLast(nums[i]);
        }
        res[index++] = deque.peekFirst();
        for (int i = k; i < nums.length; i++) {
            if(deque.peekFirst() == nums[i - k]) deque.removeFirst();
            while(!deque.isEmpty() && nums[i] > deque.peekLast()) deque.removeLast();
            deque.addLast(nums[i]);
            res[index++] = deque.peekFirst();
        }
        return res;
    }
}