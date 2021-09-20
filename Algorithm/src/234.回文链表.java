/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head,fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null) slow = slow.next;
        cut(head,slow);
        return isEqual(head, reverse(slow));
    }

    private boolean isEqual(ListNode l1, ListNode l2) {
        while(l1 != null && l2 != null){
            if(l1.val != l2.val)
                return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }

    private ListNode reverse(ListNode slow) {
        ListNode newhead = null;
        while(slow != null){
            ListNode node = slow.next;
            slow.next = newhead;
            newhead = slow;
            slow = node;
        }
        return newhead;
    }

    private void cut(ListNode head, ListNode slow) {
        while(head.next != slow)
            head = head.next;
        head.next = null;
    }
}
// @lc code=end

