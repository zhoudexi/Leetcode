import java.util.Stack;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if(stack.empty()) return false;
                char cc = stack.pop();
                boolean b1 = c == ')' && cc != '(';
                boolean b2 = c == '}' && cc != '{';
                boolean b3 = c == ']' && cc != '[';
                if(b1 || b2 || b3) return false;
            }
        }
        return stack.empty();
    }
}
// @lc code=end

