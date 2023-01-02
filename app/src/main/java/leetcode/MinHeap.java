package leetcode;

public class MinHeap {
    int[] minHeap;
    int heapSize;
    int realSize = 0;

    public MinHeap(int heapSize) {
        this.heapSize = heapSize;
        minHeap = new int[heapSize + 1];
        minHeap[0] = 0;
    }

    public void add(int element) {
        realSize++;

        if (realSize > heapSize) {
            realSize--;
            throw new IllegalStateException("too many elements!");
        }

        minHeap[realSize] = element;
        int index = realSize;
        int parent = index / 2;
        while (minHeap[index] < minHeap[parent] && index > 1) {
            int temp = minHeap[index];
            minHeap[index] = minHeap[parent];
            minHeap[parent] = temp;
            index = parent;
            parent = index / 2;
        }
    }

    public int pop() {
        if (realSize < 1) {
            throw new IllegalStateException("no elements");
        }

        int removeElement = minHeap[1];
        minHeap[1] = minHeap[realSize];
        realSize--;
        int index = 1;
        while (index <= realSize / 2) {
            int left = index * 2;
            int right = (index * 2) + 1;
            if (minHeap[index] <= minHeap[left] && minHeap[index] <= minHeap[right]) {
                break;
            }
            if (minHeap[left] < minHeap[right]) {
                int temp = minHeap[left];
                minHeap[left] = minHeap[index];
                minHeap[index] = temp;
                index = left;
            } else {
                int temp = minHeap[right];
                minHeap[right] = minHeap[index];
                minHeap[index] = temp;
                index = right;
            }
        }
        return removeElement;
    }

    public int peek() {
        return minHeap[1];
    }

    public int size() {
        return realSize;
    }

    @Override
    public String toString() {
        if (realSize == 0) {
            return "No element!";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i = 1; i <= realSize; i++) {
                sb.append(minHeap[i]);
                sb.append(',');
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(']');
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        // Test case
        MinHeap minHeap = new MinHeap(3);
        minHeap.add(3);
        minHeap.add(1);
        minHeap.add(2);
        // [1,3,2]
        System.out.println(minHeap);
        // 1
        System.out.println(minHeap.peek());
        // 1
        System.out.println(minHeap.pop());
        // [2, 3]
        System.out.println(minHeap);
        minHeap.add(4);
        // Add too many elements
        try {
            minHeap.add(5);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
        // [2,3,4]
        System.out.println(minHeap);
    }
}
