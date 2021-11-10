import java.util.Stack;

/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 */

// @lc code=start
class MinStack {
    private Stack<Integer> s1;
    private Stack<Integer> s2;
    private int min;
    public MinStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        s1.add(val);
        min = Math.min(min, val);
        s2.add(min);
    }
    
    public void pop() {
        s1.pop();
        s2.pop();
        min = s2.empty() ? Integer.MAX_VALUE : s2.peek();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return s2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end

