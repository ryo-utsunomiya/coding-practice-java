package leetcode.oddevenlinkedlist;

import leetcode.ListNode;

public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }

        var odd = head;
        var even = head.next;
        var evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next; // odd.next = 3
            odd = odd.next; // odd = 3
            even.next = odd.next; // even.next = 4
            even = even.next; // even = 4
        }
        odd.next = evenHead; // 5 -> 2
        return head;
    }

    public static void main(String[] args) {
        var s = new Solution();
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
            var result = s.oddEvenList(a);
            System.out.println(result);
        }
    }
}
