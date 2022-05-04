package leetcode.designlinkedlist;

import leetcode.DoublyListNode;

public class MyDoublyLinkedList {
    DoublyListNode head;

    MyDoublyLinkedList() {
    }

    int get(int index) {
        int i = 0;
        var current = head;
        while (current != null) {
            if (i == index) {
                return current.val;
            }
            i++;
            current = current.next;
        }
        throw new IllegalArgumentException("index is out of range");
    }

    void addAtHead(int val) {
        if (this.head == null) {
            this.head = new DoublyListNode(val);
        } else {
            var newHead = new DoublyListNode(val);
            this.head.prev = newHead;
            newHead.next = this.head;
            this.head = newHead;
        }
    }

    void addAtTail(int val) {
        if (this.head == null) {
            this.head = new DoublyListNode(val);
        } else {
            var current = head;
            while (current.next != null) {
                current = current.next;
            }
            // here, current is tail
            var newTail = new DoublyListNode(val);
            newTail.prev = current;
            current.next = newTail;
        }
    }

    void addAtIndex(int index, int val) {
        if (this.head == null) {
            if (index == 0) {
                this.addAtHead(val);
            } else {
                throw new IllegalArgumentException("index is out of range");
            }
        } else {
            int i = 0;
            var current = head;
            while (current != null) {
                if (i + 1 == index) {
                    // here current is 1
                    var newNode = new DoublyListNode(val); // 2
                    newNode.prev = current; // 1 <- 2
                    newNode.next = current.next; // 2 -> 3
                    newNode.next.prev = newNode; // 2 <- 3
                    current.next = newNode; // 1 -> 2
                    break;
                }
                i++;
                current = current.next;
            }
            if (current == null) {
                throw new IllegalArgumentException("index is out of range");
            }
        }
    }

    void deleteAtIndex(int index) {
        if (this.head == null) {
            throw new IllegalArgumentException("index is out of range");
        } else {
            int i = 0;
            var current = head;
            while (current != null) {
                if (i == index) {
                    if (current.prev != null) {
                        current.prev.next = current.next;
                    }
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                    break;
                }
                i++;
                current = current.next;
            }
            if (current == null) {
                throw new IllegalArgumentException("index is out of range");
            }
        }
    }

    public static void main(String[] args) {
        var list = new MyDoublyLinkedList();
        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1, 2);
        System.out.println(list.get(1));
        list.deleteAtIndex(1);
        System.out.println(list.get(1));
    }
}
