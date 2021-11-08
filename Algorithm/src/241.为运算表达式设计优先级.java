import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=241 lang=java
 *
 * [241] 为运算表达式设计优先级
 */

// @lc code=start
class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if(c == '+' || c == '-' || c == '*'){
                List<Integer> l = diffWaysToCompute(expression.substring(0, i));
                List<Integer> r = diffWaysToCompute(expression.substring(i + 1));
                for (int l1 : l) {
                    for (int r1 : r) {
                        switch(c){
                            case '+':
                                list.add(l1 + r1);
                                break;
                            case '-':
                                list.add(l1 - r1);
                                break;
                            case '*':
                                list.add(l1 * r1);
                                break; 
                        }
                    }
                }
            } 
        }
        if(list.size() == 0) list.add(Integer.valueOf(expression));
        return list;
    }
}
// @lc code=end

