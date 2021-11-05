/*
 * @lc app=leetcode.cn id=605 lang=java
 *
 * [605] 种花问题
 */

// @lc code=start
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i += 2) {
            if(flowerbed[i] == 0){
                if(i == flowerbed.length - 1 || flowerbed[i + 1] == 0){
                    n--;
                }else{
                    i++;
                }
            }
        }
        return n <= 0;
    }
}
// @lc code=end

