// @algorithm @lc id=100294 lang=java 
// @title lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof


package ____Offer_22_______k____LCOF;
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
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p1 = head, p2 = head;
        while(p1 != null && k-- > 0) p1 = p1.next;
        if(k > 0) return null;
        while(p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}