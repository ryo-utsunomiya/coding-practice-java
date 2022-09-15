package leetcode.minstack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    static class MinStack {
        Deque<ValMinPair> stack = new ArrayDeque<>();

        public void push(int i) {
            int min;
            if (stack.isEmpty()) {
                min = i;
            } else {
                min = Math.min(getMin(), i);
            }
            stack.push(new ValMinPair(i, min));
        }

        public void pop() {
            stack.pop();
        }

        public int getMin() {
            if (stack.isEmpty()) {
                throw new IllegalStateException("stack is empty");
            }
            return stack.peek().min;
        }

        public int top() {
            if (stack.isEmpty()) {
                throw new IllegalStateException("stack is empty");
            }
            return stack.peek().val;
        }

        static class ValMinPair {
            int val;
            int min;
            public ValMinPair(int val, int min) {
                this.val = val;
                this.min = min;
            }
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2
    }
}
