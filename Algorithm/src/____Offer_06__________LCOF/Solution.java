// @algorithm @lc id=100282 lang=java 
// @title cong-wei-dao-tou-da-yin-lian-biao-lcof


package ____Offer_06__________LCOF;
import java.util.ArrayList;
import java.util.Stack;

import algm.*;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    ArrayList<Integer> tmp = new ArrayList<>();
    public int[] reversePrint(ListNode head) {
        //辅助栈法
        // Stack<Integer> stack = new Stack<>();
        // while(head != null){
        //     stack.add(head.val);
        //     head = head.next;
        // }
        // int[] res = new int[stack.size()];
        // for (int i = 0; i < res.length; i++) {
        //     res[i] = stack.pop();
        // }
        // return res;
        recur(head);
        int[] res = new int[tmp.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = tmp.get(i);
        }
        return res;
    }
    private void recur(ListNode head) {
        if(head == null) return;
        recur(head.next);
        tmp.add(head.val);
    }
}