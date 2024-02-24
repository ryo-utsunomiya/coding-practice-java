package leetcode.minstack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class Solution {
    static class MinStack {
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> minStack = new ArrayDeque<>();

        public void push(int val) {
            stack.push(val);
            if (minStack.isEmpty() || val < minStack.peek()) {
                minStack.push(val);
            }
        }

        public void pop() {
            int val = stack.pop();
            if (!minStack.isEmpty() && val == minStack.peek()) {
                minStack.pop();
            }
        }

        public int top() {
            if (stack.isEmpty()) {
                throw new NoSuchElementException("stack is empty");
            }
            return stack.peek();
        }

        public int getMin() {
            if (minStack.isEmpty()) {
                throw new NoSuchElementException("minStack is empty");
            }
            return minStack.peek();
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
