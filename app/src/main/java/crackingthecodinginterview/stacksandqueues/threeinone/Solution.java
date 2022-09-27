package crackingthecodinginterview.stacksandqueues.threeinone;

import java.util.EmptyStackException;

public class Solution {
    public static class MultiStack {
        private final StackInfo[] info;
        private final int[] values;

        public MultiStack(int numberOfStacks, int defaultSize) {
            info = new StackInfo[numberOfStacks];
            for (int i = 0; i < numberOfStacks; i++) {
                info[i] = new StackInfo(defaultSize * i, defaultSize);
            }
            values = new int[numberOfStacks * defaultSize];
        }

        public void push(int stackNum, int value) {
            if (allStacksAreFull()) {
                throw new FullStackException();
            }

            var stack = info[stackNum];
            if (stack.isFull()) {
                expand(stackNum);
            }

            stack.size++;
            values[stack.lastElementIndex()] = value;
        }

        public int pop(int stackNum) {
            var stack = info[stackNum];
            if (stack.isEmpty()) {
                throw new EmptyStackException();
            }

            int value = values[stack.lastElementIndex()];
            values[stack.lastElementIndex()] = 0;
            stack.size--;
            return value;
        }

        public int peek(int stackNum) {
            var stack = info[stackNum];
            return values[stack.lastElementIndex()];
        }

        public int numberOfElements() {
            int size = 0;
            for (var stack : info) {
                size += stack.size;
            }
            return size;
        }

        private void shift(int stackNum) {
            var stack = info[stackNum];
            if (stack.size >= stack.capacity) {
                int nextStack = (stackNum + 1) % info.length;
                shift(nextStack);
                stack.capacity++;
            }

            int index = stack.lastCapacityIndex();
            while (stack.isWithinStackCapacity(index)) {
                values[index] = values[previousIndex(index)];
                index = previousIndex(index);
            }

            values[stack.start] = 0;
            stack.start = nextIndex(stack.start);
            stack.capacity--;
        }

        private void expand(int stackNum) {
            shift((stackNum + 1) % info.length);
            info[stackNum].capacity++;
        }

        private boolean allStacksAreFull() {
            return numberOfElements() == values.length;
        }

        private int adjustIndex(int index) {
            int max = values.length;
            return ((index % max) + max) % max;
        }

        private int nextIndex(int index) {
            return adjustIndex(index + 1);
        }

        private int previousIndex(int index) {
            return adjustIndex(index - 1);
        }

        private class StackInfo {
            public int start;
            public int size;
            public int capacity;

            public StackInfo(int start, int capacity) {
                this.size = start;
                this.capacity = capacity;
            }

            public boolean isWithinStackCapacity(int index) {
                if (index < 0 || index >= values.length) {
                    return false;
                }

                int contiguousIndex = index < start ? index + values.length : index;
                int end = start + capacity;
                return start <= contiguousIndex && contiguousIndex < end;
            }

            public int lastCapacityIndex() {
                return adjustIndex(start + capacity - 1);
            }

            public int lastElementIndex() {
                return adjustIndex(start + size - 1);
            }

            public boolean isFull() {
                return size == capacity;
            }

            public boolean isEmpty() {
                return size == 0;
            }
        }

        private static class FullStackException extends RuntimeException {
        }
    }
}
