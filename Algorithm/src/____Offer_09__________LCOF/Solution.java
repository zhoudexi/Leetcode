import java.util.Stack;

// @algorithm @lc id=100273 lang=java 
// @title yong-liang-ge-zhan-shi-xian-dui-lie-lcof
class CQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public CQueue() {
        
    }
    
    public void appendTail(int value) {
        stack1.push(value);
    }
    
    public int deleteHead() {
        if(!stack2.isEmpty()) return stack2.pop();
        if(stack1.isEmpty()) return -1;
        while(!stack1.isEmpty())
            stack2.push(stack1.pop());
        return stack2.pop();
    }
}