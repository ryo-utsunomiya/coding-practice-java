package leetcode.designcircularqueue;

public class Solution {
    static class MyCircularQueue {
        private final int[] data;
        private final int size;
        private int head;
        private int tail;

        public MyCircularQueue(int k) {
            data = new int[k];
            size = k;
            head = -1;
            tail = -1;
        }

        public boolean enQueue(int value) {
            if (isFull()) {
                return false;
            }
            if (isEmpty()) {
                head = 0;
            }
            tail = (tail + 1) % size;
            data[tail] = value;
            return true;
        }

        public boolean deQueue() {
            if (isEmpty()) {
                return false;
            }
            if (head == tail) {
                head = -1;
                tail = -1;
                return true;
            }
            head = (head + 1 % size);
            return true;
        }

        public int Front() {
            if (isEmpty()) {
                return -1;
            }
            return data[head];
        }

        public int Rear() {
            if (isEmpty()) {
                return -1;
            }
            return data[tail];
        }

        public boolean isEmpty() {
            return head == -1;
        }

        public boolean isFull() {
            return ((tail + 1) % size) == head;
        }
    }

    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        myCircularQueue.enQueue(1); // return True
        myCircularQueue.enQueue(2); // return True
        myCircularQueue.enQueue(3); // return True
        System.out.println(myCircularQueue.enQueue(4));; // return False
        System.out.println(myCircularQueue.Rear());;     // return 3
        System.out.println(myCircularQueue.isFull());;   // return True
        myCircularQueue.deQueue();  // return True
        myCircularQueue.enQueue(4); // return True
        System.out.println(myCircularQueue.Rear());;     // return 4
    }
}
