package leetcode.removenthnodefromendoflist;

import leetcode.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        while (n > 0 && fast != null) {
            fast = fast.next;
            n--;
        }

        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        assert (slow != null);

        if (fast == null) { // remove first element
            if (slow.next == null) {
                head = null;
            } else {
                head = head.next;
            }
        } else {
            if (slow.next == null) { // only one element in the list
                head = null;
            } else if (slow.next.next == null) {
                slow.next = null;
            } else {
                slow.next = slow.next.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        {
            var a = new ListNode(1);
            var b = new ListNode(2);
            var c = new ListNode(3);
            var d = new ListNode(4);
            var e = new ListNode(5);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            new Solution().removeNthFromEnd(a, 2);
            System.out.println(c.next.val == 5);
        }
        {
            var a = new ListNode(1);
            System.out.println(new Solution().removeNthFromEnd(a, 1) == null);
        }
        {
            var a = new ListNode(1);
            var b = new ListNode(2);
            a.next = b;
            System.out.println(new Solution().removeNthFromEnd(a, 1).val == 1);
        }
        {
            var a = new ListNode(1);
            var b = new ListNode(2);
            a.next = b;
            System.out.println(new Solution().removeNthFromEnd(a, 2).val == 2);
        }
    }
}
