package leetcode.designlinkedlist;

public class MyLinkedList {
    Node head;

    public MyLinkedList() {
    }

    public int get(int index) {
        int currentIndex = 0;
        Node current = head;
        while (current != null) {
            if (currentIndex == index) {
                return current.val;
            }
            current = current.next;
            currentIndex++;
        }
        return -1;
    }

    public void addAtHead(int val) {
        if (this.head == null) {
            this.head = new Node(val);
        } else {
            var newHead = new Node(val);
            newHead.next = this.head;
            this.head = newHead;
        }
    }

    public void addAtTail(int val) {
        if (this.head == null) {
            this.head = new Node(val);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(val);
        }
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
        } else {
            int currentIndex = 0;
            Node current = head;
            Node prev = null;
            while (currentIndex < index && current != null) {
                prev = current;
                current = current.next;
                currentIndex++;
            }
            if (currentIndex == index) {
                var newNode = new Node(val);
                prev.next = newNode;
                newNode.next = current;
            }
        }
    }

    public void deleteAtIndex(int index) {
        int currentIndex = 0;
        Node current = head;
        Node prev = null;
        while (currentIndex < index && current != null) {
            prev = current;
            current = current.next;
            currentIndex++;
        }
        if (currentIndex == index) {
            if (prev == null) { // index == 0
                this.head = current.next;
            } else if (prev.next != null) {
                prev.next = current.next;
            }
        }
    }

    public static class Node {
        final int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

//    public static void main(String[] args) {
//        MyLinkedList obj = new MyLinkedList();
//        obj.addAtHead(2);
//        obj.addAtIndex(0,1);
//        System.out.println(obj.get(1));
//    }
}
