package crackingthecodinginterview.stacksandqueues.stackmin;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EmptyStackException;

public class Solution {
    static class MinStack {
        Deque<Node> stack = new ArrayDeque<>();

        public void push(int val) {
            int min;
            if (stack.isEmpty()) {
                min = val;
            } else {
                min = Math.min(val, min());
            }
            stack.push(new Node(val, min));
        }

        public int pop() {
            if (stack.isEmpty()) {
                throw new EmptyStackException();
            }
            return stack.pop().val;
        }

        public int min() {
            if (stack.isEmpty()) {
                throw new EmptyStackException();
            }
            return stack.peek().min;
        }

        static class Node {
            int val;
            int min;

            public Node(int val, int min) {
                this.val = val;
                this.min = min;
            }
        }
    }

    public static void main(String[] args) {
        var stack = new MinStack();
        stack.push(1);
        stack.push(2);
        System.out.println("min:" + stack.min()); // min: 1
        System.out.println("pop:" + stack.pop()); // pop 2
        stack.push(0);
        System.out.println("min:" + stack.min()); // min: 0
        System.out.println("pop:" + stack.pop()); // pop 0
        System.out.println("min:" + stack.min()); // min: 1
    }
}
