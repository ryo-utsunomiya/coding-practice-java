package leetcode.flattenamultileveldoublylinkedlist;

public class Solution {
    public Node flatten(Node head) {
        var dummyHead = new Node(0);
        dummyHead.next = head;
        var current = head;
        while (current != null) {
            if (current.child != null) {
                var next = current.next;
                var children = flattenChildList(current.child);
                current.next = children.head;
                children.head.prev = current;
                children.tail.next = next;
                if (next != null) {
                    next.prev = children.tail;
                }
                current.child = null;
            }
            current = current.next;
        }
        return dummyHead.next;
    }

    public HeadTail flattenChildList(Node head) {
        var dummyHead = new Node(0);
        dummyHead.next = head;
        var current = head;
        while (current.next != null) {
            if (current.child != null) {
                var next = current.next;
                var children = flattenChildList(current.child);
                current.next = children.head;
                children.head.prev = current;
                children.tail.next = next;
                next.prev = children.tail;
                current.child = null;
            }
            current = current.next;
        }
        return new HeadTail(dummyHead.next, current);
    }

    static class HeadTail {
        Node head;
        Node tail;

        public HeadTail(Node head, Node tail) {
            this.head = head;
            this.tail = tail;
        }
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var a = new Node(1);
            var b = new Node(2);
            var c = new Node(3);
            a.next = b;
            a.child = c;
            var result = s.flatten(a);
            while (result != null) {
                System.out.print(result.val);
                System.out.print(",");
                result = result.next;
            }
        }
        System.out.println();
        {
            var a = new Node(1);
            var b = new Node(2);
            var c = new Node(3);
            var d = new Node(4);
            var e = new Node(5);
            var f = new Node(6);
            var g = new Node(7);
            var h = new Node(8);
            var i = new Node(9);
            var j = new Node(10);
            var k = new Node(11);
            var l = new Node(12);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;

            c.child = g;
            g.next = h;
            h.next = i;
            i.next = j;

            h.child = k;
            k.next = l;
            var result = s.flatten(a);
            while (result != null) {
                System.out.print(result.val);
                System.out.print(",");
                result = result.next;
            }
        }
    }

    static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node(int val) {
            this.val = val;
        }
    }
}
