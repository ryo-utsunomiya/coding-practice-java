package crackingthecodinginterview.linkedlist.intersection;

import crackingthecodinginterview.linkedlist.Node;

public class Solution {
    public Node findIntersection(Node list1, Node list2) {
        return null;
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var a = new Node(1);
            var b = new Node(2);
            var c = new Node(3);
            a.next = c;
            b.next = c;
            System.out.println(s.findIntersection(a, b));
        }
        {
            var a = new Node(1);
            var b = new Node(2);
            System.out.println(s.findIntersection(a, b));
        }
    }
}
