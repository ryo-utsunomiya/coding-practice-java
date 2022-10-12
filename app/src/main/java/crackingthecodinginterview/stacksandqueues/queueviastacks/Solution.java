package crackingthecodinginterview.stacksandqueues.queueviastacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    static class MyQueue<T> {
        Deque<T> addStack = new ArrayDeque<>();
        Deque<T> removeStack = new ArrayDeque<>();

        public void add(T value) {
            addStack.push(value);
        }

        public T remove() {
            shiftStacks();
            return removeStack.pop();
        }

        public T peek() {
            shiftStacks();
            return removeStack.peek();
        }

        private void shiftStacks() {
            if (removeStack.isEmpty()) {
                while (!addStack.isEmpty()) {
                    removeStack.push(addStack.pop());
                }
            }
        }

        public boolean isEmpty() {
            return addStack.isEmpty() && removeStack.isEmpty();
        }
    }

    public static void main(String[] args) {
        var q = new MyQueue<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek()); // 1
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.isEmpty());
    }
}
