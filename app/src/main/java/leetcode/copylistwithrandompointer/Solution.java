package leetcode.copylistwithrandompointer;

import java.util.HashMap;

public class Solution {
    public Node copyRandomList(Node head) {
        var dummyHead = new Node(0);
        var copyCurrent = dummyHead;
        var current = head;
        var nodeMap = new HashMap<Node, Node>();
        while (current != null) {
            var copy = new Node(current.val);
            nodeMap.put(current, copy);
            copyCurrent.next = copy;
            copyCurrent = copyCurrent.next;
            current = current.next;
        }

        // set random
        current = head;
        copyCurrent = dummyHead.next;
        while (current != null) {
            copyCurrent.random = nodeMap.get(current.random);
            copyCurrent = copyCurrent.next;
            current = current.next;
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var a = new Node(1);
            var b = new Node(2);
            a.next = b;
            a.random = b;
            b.next = null;
            b.random = b;
            var result = s.copyRandomList(a);
            System.out.println(result.val);
        }
        {
            var a = new Node(3);
            var b = new Node(3);
            var c = new Node(3);
            a.next = b;
            a.random = null;
            b.next = c;
            b.random = a;
            c.next = null;
            c.random = null;
            var result = s.copyRandomList(a);
            System.out.println(result.val);
        }
    }

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
