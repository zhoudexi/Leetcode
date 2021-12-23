/*
 * @lc app=leetcode.cn id=686 lang=java
 *
 * [686] 重复叠加字符串匹配
 */

// @lc code=start
import java.time.Clock;
class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int ans = 0;
        while (sb.length() < b.length() && ++ans > 0) sb.append(a);
        Clock clock = Clock.systemDefaultZone();
        long start = clock.millis();
        while (clock.millis() - start < 100) {
            if (sb.indexOf(b) != -1) return ans;
            sb.append(a);
            ans++;
        }
        return -1;
    }
}
// @lc code=end

