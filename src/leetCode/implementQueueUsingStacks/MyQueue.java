package leetCode.implementQueueUsingStacks;

import java.util.Stack;

class MyQueue {
    private Stack<Integer> pushS = new Stack<>();
    private Stack<Integer> popS = new Stack<>();

    MyQueue() {
    }

    void push(int x) {
        pushS.push(x);
    }

    private void transfer() {
        if (popS.isEmpty()) {
            while (!pushS.isEmpty()) {
                popS.push(pushS.pop());
            }
        }
    }

    int pop() {
        transfer();
        return popS.pop();
    }

    int peek() {
        transfer();
        return popS.peek();
    }

    boolean empty() {
        return popS.isEmpty() && pushS.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */