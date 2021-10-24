// @algorithm @lc id=100324 lang=java 
// @title he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof


package ____Offer_57___II___s________LCOF;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] findContinuousSequence(int target) {
        List<int[]> list = new ArrayList<>();
        int l = 1, r = 1, sum = 0;
        while(l <= target >> 1){
            if(sum < target){
                sum += r;
                r++;
            }else if(sum > target){
                sum -= l;
                l++;
            }else{
                int[] res = new int[r - l];
                for (int i = l; i < r; i++) res[i - l] = i;
                list.add(res);
                sum -= l;
                l++;
            } 
        }
        return list.toArray(new int[list.size()][]);
    }
}