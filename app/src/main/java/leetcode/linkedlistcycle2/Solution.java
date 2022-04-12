package leetcode.linkedlistcycle2;

import leetcode.ListNode;

import java.util.HashSet;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        var nodesSeen = new HashSet<ListNode>();

        while (head != null) {
            if (nodesSeen.contains(head)) {
                return head;
            }
            nodesSeen.add(head);
            head = head.next;
        }

        return null;
    }

    public static void main(String[] args) {
        var a = new ListNode(3);
        var b = new ListNode(2);
        var c = new ListNode(0);
        var d = new ListNode(-4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;
        var s = new Solution();
        System.out.println(s.detectCycle(a).val); // -4
    }
}
