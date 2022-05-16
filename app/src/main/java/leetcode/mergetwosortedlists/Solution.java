package leetcode.mergetwosortedlists;

import leetcode.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        var dummyHead = new ListNode(0);
        var current = dummyHead;
        var curr1 = list1;
        var curr2 = list2;
        while (curr1 != null && curr2 != null) {
            if (curr1.val < curr2.val) {
                current.next = curr1;
                curr1 = curr1.next;
            } else {
                current.next = curr2;
                curr2 = curr2.next;
            }
            current = current.next;
        }
        while (curr1 != null) {
            current.next = curr1;
            current = current.next;
            curr1 = curr1.next;
        }
        while (curr2 != null) {
            current.next = curr2;
            current = current.next;
            curr2 = curr2.next;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var a = new ListNode(1);
            var b = new ListNode(2);
            var c = new ListNode(4);
            a.next = b;
            b.next = c;

            var d = new ListNode(1);
            var e = new ListNode(3);
            var f = new ListNode(4);
            d.next = e;
            e.next = f;

            var result = s.mergeTwoLists(a, d);
            System.out.println(result);
        }
        {
            var result = s.mergeTwoLists(null, null);
            System.out.println(result);
        }
        {
            var a = new ListNode(0);
            var result = s.mergeTwoLists(null, a);
            System.out.println(result);
        }
    }
}
