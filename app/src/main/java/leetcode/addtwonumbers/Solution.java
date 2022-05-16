package leetcode.addtwonumbers;

import leetcode.LinkedListUtil;
import leetcode.ListNode;

import java.util.List;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var c1 = l1;
        var c2 = l2;
        ListNode resultHead = new ListNode(0);
        ListNode current = resultHead;
        while (c1 != null && c2 != null) {
            int val = c1.val + c2.val;
            int next = 0;
            if (val >= 10) {
                next = 1;
                val -= 10;
            }
            if (current.next == null) {
                current.next = new ListNode(val);
            } else {
                if (current.next.val + val >= 10) {
                    current.next.next = new ListNode(1);
                    current.next.val = current.next.val + val - 10;
                } else {
                    current.next.val = current.next.val + val;
                }
            }
            if (next > 0) {
                current.next.next = new ListNode(next);
            }
            c1 = c1.next;
            c2 = c2.next;
            current = current.next;
        }
        while (c1 != null) {
            if (current.next == null) {
                current.next = new ListNode(c1.val);
            } else {
                if (current.next.val + c1.val >= 10) {
                    current.next.next = new ListNode(1);
                    current.next.val = current.next.val + c1.val - 10;
                } else {
                    current.next.val = current.next.val + c1.val;
                }
            }
            c1 = c1.next;
            current = current.next;
        }
        while (c2 != null) {
            if (current.next == null) {
                current.next = new ListNode(c2.val);
            } else {
                if (current.next.val + c2.val >= 10) {
                    current.next.next = new ListNode(1);
                    current.next.val = current.next.val + c2.val - 10;
                } else {
                    current.next.val = current.next.val + c2.val;
                }
            }
            c2 = c2.next;
            current = current.next;
        }
        if (resultHead.next == null) {
            return resultHead; // zero
        } else {
            return resultHead.next;
        }
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var a = new ListNode(2);
            var b = new ListNode(4);
            var c = new ListNode(3);
            a.next = b;
            b.next = c;

            var d = new ListNode(5);
            var e = new ListNode(6);
            var f = new ListNode(4);
            d.next = e;
            e.next = f;

            var result = s.addTwoNumbers(a, d);
            LinkedListUtil.print(result); // 7, 0, 8
        }
        {
            var a = new ListNode(0);
            var b = new ListNode(0);
            var result = s.addTwoNumbers(a, b);
            LinkedListUtil.print(result); // 0
        }
        {
            var a = LinkedListUtil.from(List.of(9, 9, 9, 9, 9, 9, 9));
            var b = LinkedListUtil.from(List.of(9, 9, 9, 9));
            var result = s.addTwoNumbers(a, b);
            LinkedListUtil.print(result); // 0
        }
    }
}
