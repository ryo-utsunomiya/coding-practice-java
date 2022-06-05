package leetcode.insertintoacyclicsortedlist;

public class Solution {
    public Node insert(Node head, int insertVal) {
        if (head == null) {
            var newNode = new Node(insertVal);
            newNode.next = newNode;
            return newNode;
        }

        Node current = head;

        if (current.next == null) {
            var newNode = new Node(insertVal);
            newNode.next = current;
            current.next = newNode;
            return head;
        }

        Node min = new Node(Integer.MAX_VALUE);
        Node max = new Node(Integer.MIN_VALUE);

        while (true) {
            if (current.val <= insertVal && insertVal <= current.next.val) {
                var newNode = new Node(insertVal);
                newNode.next = current.next;
                current.next = newNode;
                return head;
            }

            if (current.val < min.val) {
                min = current;
            }
            if (current.val >= max.val) {
                max = current;
            }

            current = current.next;

            if (current == head) {
                break;
            }
        }

        if (insertVal < min.val || max.val < insertVal) {
            var newNode = new Node(insertVal);
            newNode.next = min;
            max.next = newNode;
        }

        return head;
    }

    static class Node {
        public int val;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    }

    public static void main(String[] args) {
        var s = new Solution();
//        {
//            var a = new Node(3);
//            var b = new Node(4);
//            var c = new Node(1);
//            a.next = b;
//            b.next = c;
//            c.next = a;
//            var result = s.insert(a, 2);
//            System.out.println(result.val);
//        }
        {
            var a = new Node(3);
            var b = new Node(3);
            var c = new Node(3);
            a.next = b;
            b.next = c;
            c.next = a;
            var result = s.insert(a, 0);
            System.out.println(result.val);
        }
//        {
//            var result = s.insert(null, 1);
//            System.out.println(result.val);
//        }
//        {
//            var a = new Node(1);
//            var result = s.insert(a, 0);
//            System.out.println(result.val);
//        }
    }
}
