package ____Offer_59___II________LCOF;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class MaxQueue {
        Deque<Integer> deque;
        Queue<Integer> queue;
    public MaxQueue() {
        deque = new LinkedList<>();
        queue = new LinkedList<>();
    }
    
    public int max_value() {
        return deque.isEmpty() ? -1 : deque.peekFirst();
    }
    
    public void push_back(int value) {
        queue.offer(value);
        while(!deque.isEmpty() && deque.peekLast() < value) deque.pollLast();
        deque.offerLast(value);
    }
    
    public int pop_front() {
        if(queue.isEmpty()) return -1;
        if(queue.peek().equals(deque.peekFirst())) deque.pollFirst();
        return queue.poll();  
    }
}

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */