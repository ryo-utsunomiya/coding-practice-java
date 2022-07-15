package udemyalgo.linkedlist;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList() {
        this(null);
    }

    public DoublyLinkedList(Node head) {
        this.head = head;
    }

    public void append(int data) {
        var newNode = new Node(data, null, null);
        if (this.head == null) {
            this.head = newNode;
            return;
        }

        Node currentNode = this.head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        newNode.prev = currentNode;
    }

    public void insert(int data) {
        var newNode = new Node(data, null, null);
        if (this.head == null) {
            this.head = newNode;
            return;
        }

        this.head.prev = newNode;
        newNode.next = this.head;
        this.head = newNode;
    }

    public void remove(int data) {
        Node currentNode = this.head;
        if (currentNode != null && currentNode.data == data) {
            if (currentNode.next == null) {
                this.head = null;
                return;
            } else {
                Node nextNode = currentNode.next;
                nextNode.prev = null;
                this.head = nextNode;
                return;
            }
        }

        while (currentNode != null && currentNode.data != data) {
            currentNode = currentNode.next;
        }

        if (currentNode == null) {
            return;
        }

        if (currentNode.next == null) {
            Node prevNode = currentNode.prev;
            prevNode.next = null;
        } else {
            Node nextNode = currentNode.next;
            Node prevNode = currentNode.prev;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
        }
    }

    @Override
    public String toString() {
        var sb = new StringBuilder("[");

        var currentNode = this.head;
        while (true) {
            sb.append(currentNode.data);
            currentNode = currentNode.next;

            if (currentNode == null) {
                break;
            } else {
                sb.append(",");
            }
        }

        sb.append("]");
        return sb.toString();
    }

    static class Node {
        private final int data;
        private Node next;
        private Node prev;

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        var d = new DoublyLinkedList();
        d.append(1);
        d.append(2);
        d.append(3);
        d.insert(0);
        d.remove(2);
        System.out.println(d);
    }
}
