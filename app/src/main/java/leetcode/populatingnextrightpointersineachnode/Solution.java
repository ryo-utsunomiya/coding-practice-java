package leetcode.populatingnextrightpointersineachnode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        // level order traversal
        Deque<Node> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                assert(node != null);
                if (i < size - 1) {
                    node.next = queue.peek();
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        return root;
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var root = new Node(1);
            root.left = new Node(2);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right = new Node(3);
            root.right.left = new Node(6);
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
