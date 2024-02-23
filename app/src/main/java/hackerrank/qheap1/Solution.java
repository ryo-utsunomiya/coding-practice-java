package hackerrank.qheap1;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        var heap = new MinHeap();
        for (int i = 0; i < q; i++) {
            int operation = scanner.nextInt();
            if (operation == 1) {
                heap.insert(scanner.nextInt());
            } else if (operation == 2) {
                heap.delete(scanner.nextInt());
            } else {
                System.out.println(heap.peek());
            }
        }
    }

    static class MinHeap {
        private final List<Integer> heap = new ArrayList<>();

        public void insert(int value) {
            heap.add(value);
            // restructure the heap from the tail
            int currentIndex = heap.size() - 1;

            // [2,3,4,5] insert(1)
            // [2,3,4,5,1] currentIndex = 4, parentIndex = 1 swap(4,1) set(currentIndex, 1)
            // [2,1,4,5,3] currentIndex = 1, parentIndex = 0 swap(1,0)
            // [1,2,4,5,3] done
            while (currentIndex > 0) { // O(log n)
                // [2] indices: [0]
                // [3,4] indices: [1,2] parent indices: [0]
                // [5,1] indices: [3,4] parent indices: [1,2]
                int parentIndex = (currentIndex - 1) / 2;
                if (heap.get(currentIndex) < heap.get(parentIndex)) {
                    swap(currentIndex, parentIndex);
                    currentIndex = parentIndex;
                } else {
                    break;
                }
            }
        }

        public void delete(int value) {
            int index = heap.indexOf(value); // O(n)
            if (index == -1) {
                return;
            }

            // Swap target value with the last value
            swap(index, heap.size() - 1);
            // Remove the last value
            heap.remove(heap.size() - 1);

            // restructure the heap from the index to tail
            // [1,2,3,4,5] delete(1)
            // [1,2,3,4,5] index = 0, swap(0,4)
            // [5,2,3,4,1] remove(4)
            // [5,2,3,4] smallestIndex = 1 swap(0, 1) set(index, 0)
            // [2,5,3,4] index = 0, smallestIndex = 0 break
            // [2,5,3,4] done
            while (index < heap.size()) { // O(log n)
                int smallestIndex = getSmallestIndex(index);
                if (smallestIndex != index) {
                    swap(index, smallestIndex);
                    index = smallestIndex;
                } else {
                    break;
                }
            }
        }

        private int getSmallestIndex(int index) {
            // [5] indices: [0] children indices: [1,2]
            // [2,3] indices: [1,2] children indices: [3,4,5,6]
            // [4] indices: [3]
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            int smallestIndex = index;

            if (leftChildIndex < heap.size() && heap.get(leftChildIndex) < heap.get(smallestIndex)) {
                smallestIndex = leftChildIndex;
            }
            if (rightChildIndex < heap.size() && heap.get(rightChildIndex) < heap.get(smallestIndex)) {
                smallestIndex = rightChildIndex;
            }
            return smallestIndex;
        }

        public int peek() {
            if (heap.isEmpty()) {
                throw new NoSuchElementException("heap is empty");
            }
            return heap.get(0); // O(1)
        }

        private void swap(int i, int j) {
            int temp = heap.get(i);
            heap.set(i, heap.get(j));
            heap.set(j, temp);
        }
    }
}
