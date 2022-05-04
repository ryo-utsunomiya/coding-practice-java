package leetcode.palindromelinkedlist;

import leetcode.ListNode;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode c1 = head;
        ListNode c2 = reverseList(cloneList(head));
        while (c1 != null && c2 != null) {
            if (c1.val != c2.val) {
                return false;
            }
            c1 = c1.next;
            c2 = c2.next;
        }

        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode cloneList(ListNode head) {
        ListNode cloneHead = new ListNode(head.val);
        ListNode clone = cloneHead;
        ListNode current = head;
        while (current != null) {
            clone.next = current.next == null ? null : new ListNode(current.next.val);
            current = current.next;
            clone = clone.next;
        }
        return cloneHead;
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var a = new ListNode(1);
            var b = new ListNode(2);
            var c = new ListNode(2);
            var d = new ListNode(1);
            a.next = b;
            b.next = c;
            c.next = d;
            System.out.println(s.isPalindrome(a) == true);
        }
        {
            var a = new ListNode(1);
            var b = new ListNode(2);
            a.next = b;
            System.out.println(s.isPalindrome(a) == false);
        }
        {
            var a = new ListNode(1);
            var b = new ListNode(1);
            var c = new ListNode(2);
            var d = new ListNode(1);
            a.next = b;
            b.next = c;
            c.next = d;
            System.out.println(s.isPalindrome(a) == false);
        }
    }
}
