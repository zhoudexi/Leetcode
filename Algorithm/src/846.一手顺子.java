import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=846 lang=java
 *
 * [846] 一手顺子
 */

// @lc code=start
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if(n % groupSize != 0) return false;
        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
        for (int i : hand) {
            cnt.put(i, cnt.getOrDefault(i, 0) + 1);
        }
        for (int i : hand) {
            if(!cnt.containsKey(i))
                continue;
            for (int j = 0; j < groupSize; j++) {
                int num = x + j;
                if(!cnt.containsKey(num))
                    return false ;
                cnt.put(num, cnt.get(num) - 1);
                if(cnt.get(num) == 0)
                    cnt.remove(num);
            }
        }
        return true;
    }
}
// @lc code=end

