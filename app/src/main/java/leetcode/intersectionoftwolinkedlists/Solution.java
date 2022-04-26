package leetcode.intersectionoftwolinkedlists;

import leetcode.ListNode;

import java.util.HashMap;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        var visited = new HashMap<ListNode, Boolean>();
        ListNode current;

        current = headA;
        while (current != null) {
            visited.put(current, true);
            current = current.next;
        }

        current = headB;
        while (current != null) {
            if (visited.containsKey(current)) {
                return current;
            }
            current = current.next;
        }

        return null;
    }

    public static void main(String[] args) {
        var a0 = new ListNode(4);
        var a1 = new ListNode(1);

        var b0 = new ListNode(5);
        var b1 = new ListNode(6);
        var b2 = new ListNode(1);

        var c0 = new ListNode(8);
        var c1 = new ListNode(4);
        var c2 = new ListNode(5);
        c0.next = c1;
        c1.next = c2;

        a0.next = a1;
        a1.next = c0;

        b0.next = b1;
        b1.next = b2;
        b2.next = c0;

        var node = new Solution().getIntersectionNode(a0, b0);
        if (node == null) {
            System.out.println("null");
        } else {
            System.out.println(node.val);
        }
    }
}
