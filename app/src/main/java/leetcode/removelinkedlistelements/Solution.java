package leetcode.removelinkedlistelements;

import leetcode.ListNode;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return null;
        }

        ListNode current = head;
        ListNode next = head.next;

        while (current != null) {
            if (next == null) { // current is the last element
                break;
            } else {
                if (next.val == val) {
                    current.next = next.next;
                } else {
                    current = current.next;
                }
                next = next.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var a = new ListNode(1);
            var b = new ListNode(2);
            var c = new ListNode(6);
            var d = new ListNode(3);
            var e = new ListNode(4);
            var f = new ListNode(5);
            var g = new ListNode(6);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;
            f.next = g;
            var result = s.removeElements(a, 6);
            System.out.println(result);
        }
//        {
//            var result = s.removeElements(null, 1);
//            System.out.println(result);
//        }
//        {
//            var a = new ListNode(7);
//            var b = new ListNode(7);
//            var c = new ListNode(7);
//            var d = new ListNode(7);
//            a.next = b;
//            b.next = c;
//            c.next = d;
//            var result = s.removeElements(a, 7);
//            System.out.println(result);
//        }
    }
}
