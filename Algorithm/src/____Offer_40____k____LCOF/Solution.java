// @algorithm @lc id=100301 lang=java 
// @title zui-xiao-de-kge-shu-lcof


package ____Offer_40____k____LCOF;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k == 0 || arr.length == 0) return new int[0];
        Queue<Integer> pq = new PriorityQueue<>((v1, v2) -> v2 - v1);
        for (int num : arr) {
            if(pq.size() < k) pq.offer(num);
            else if(num < pq.peek()){
                pq.poll();
                pq.offer(num);
            }
        }
        int[] res = new int[pq.size()];
        int i = 0;
        for (int num : pq) {
            res[i++] = num;
        }
        return res;
    }
}