package crackingthecodinginterview.stacksandqueues.stackofplaces;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    static class SetOfStacks {
        private final int capacity;
        private final List<Deque<Integer>> stacks = new ArrayList<>();

        public SetOfStacks(int capacity) {
            this.capacity = capacity;
            this.stacks.add(new ArrayDeque<>());
        }

        public void push(int val) {
            var stack = stacks.get(stacks.size() - 1);
            if (stack == null) {
                throw new IllegalStateException("stack not found");
            }

            if (stack.size() + 1 < capacity) {
                stack.push(val);
            } else {
                // create new stack
                var newStack = new ArrayDeque<Integer>();
                newStack.push(val);
                stacks.add(newStack);
            }
        }

        public int pop() {
            return popAt(stacks.size() - 1);
        }

        public int peek() {
            var stack = stacks.get(stacks.size() - 1);
            if (stack == null || stack.isEmpty()) {
                throw new IllegalStateException("stack is empty");
            }
            return stack.peek();
        }

        public int popAt(int index) {
            var stack = stacks.get(index);
            if (stack == null || stack.isEmpty()) {
                throw new IllegalStateException("stack is empty");
            }

            int val = stack.pop();

            if (stack.isEmpty()) {
                stacks.remove(index);
            }

            return val;

        }
    }

    public static void main(String[] args) {
        var s = new SetOfStacks(3);
        s.push(1);
        System.out.println(s.peek()); // 1
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.peek()); // 4
        s.pop();
        System.out.println(s.peek()); // 3
    }
}
