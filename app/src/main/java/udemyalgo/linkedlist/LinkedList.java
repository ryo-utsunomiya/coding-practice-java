package udemyalgo.linkedlist;

public class LinkedList<E> {
    private Node<E> head;

    public LinkedList() {
        this(null);
    }

    public LinkedList(Node<E> head) {
        this.head = head;
    }

    public void append(E data) {
        var newNode = new Node<>(data);
        if (this.head == null) {
            this.head = newNode;
            return;
        }

        var lastNode = this.head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void insert(E data) {
        var newNode = new Node<>(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void remove(E data) {
        var currentNode = this.head;
        if (currentNode != null && currentNode.data == data) {
            this.head = currentNode.next;
            return;
        }

        Node<E> previousNode = null;
        while (currentNode != null && currentNode.data != data) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }

        if (currentNode != null) {
            previousNode.next = currentNode.next;
        }
    }

    public void reverse() {
        var currentNode = this.head;
        Node<E> previousNode = null;
        while (currentNode != null) {
            var nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        this.head = previousNode;
    }

    public void reverseRecursive() {
        this.head = innerReverseRecursive(this.head, null);
    }

    private Node<E> innerReverseRecursive(Node<E> currentNode, Node<E> previousNode) {
        if (currentNode == null) {
            return previousNode;
        }

        var nextNode = currentNode.next;
        currentNode.next = previousNode;
        previousNode = currentNode;
        currentNode = nextNode;
        return innerReverseRecursive(currentNode, previousNode);
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

    public static class Node<E> {
        private final E data;
        private Node<E> next;

        public Node(E data) {
            this(data, null);
        }

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return String.valueOf(this.data);
        }
    }

    // [1,4,6,8,9] => [1,8,6,4,9]
    public static LinkedList<Integer> reverseEven(LinkedList<Integer> list) {
        list.head = innerReverseEven(list.head, null);
        return list;
    }

    private static Node<Integer> innerReverseEven(Node<Integer> head, Node<Integer> previousNode) {
        if (head == null) {
            return null;
        }

        var currentNode = head;
        while (currentNode != null && currentNode.data % 2 == 0) {
            var nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        if (currentNode != head) {
            head.next = currentNode;
            innerReverseEven(currentNode, previousNode);
            return previousNode;
        } else {
            head.next = innerReverseEven(head.next, head);
            return head;
        }
    }

    public static void main(String[] args) {
//        var l = new LinkedList<Integer>();
//        l.append(1);
//        l.append(2);
//        l.insert(3);
//        l.remove(1);
//        System.out.println(l);
//        l.reverse();
//        System.out.println(l);
//        l.reverseRecursive();
//        System.out.println(l);

        var l = new LinkedList<Integer>();
        l.append(1);
        l.append(4);
        l.append(6);
        l.append(8);
        l.append(9);
        System.out.println(l);
        System.out.println(reverseEven(l));
    }
}
