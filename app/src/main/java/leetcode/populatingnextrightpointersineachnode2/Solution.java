package leetcode.populatingnextrightpointersineachnode2;

public class Solution {
    Node leftmost; // 1 -> 2 -> 4
    Node prev; // 2 -> 3 -> 4 -> 5 -> 7

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        this.leftmost = root;

        while (this.leftmost != null) {
            Node curr = this.leftmost;
            this.leftmost = null;
            this.prev = null;

            while (curr != null) {
                processChild(curr.left);
                processChild(curr.right);
                curr = curr.next;
            }
        }

        return root;
    }

    void processChild(Node child) {
        if (child == null) {
            return;
        }

        if (this.prev == null) {
            this.leftmost = child;
        } else {
            this.prev.next = child;
        }
        this.prev = child;
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var root = new Node(1);
            root.left = new Node(2);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right = new Node(3);
            root.right.right = new Node(7);
            System.out.println(s.connect(root));
        }
        {
            System.out.println(s.connect(null));
        }
    }

    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
}
