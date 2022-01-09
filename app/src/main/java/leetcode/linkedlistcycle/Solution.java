package leetcode.linkedlistcycle;

import leetcode.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.hasCycle(null)); // false

        var a = new ListNode(3);
        var b = new ListNode(2);
        var c = new ListNode(0);
        var d = new ListNode(-4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;
        System.out.println(s.hasCycle(a)); // true

        var e = new ListNode(1);
        var f = new ListNode(2);
        e.next = f;
        f.next = e;
        System.out.println(s.hasCycle(e)); // true

        System.out.println(s.hasCycle(new ListNode(1))); // false
    }
}
