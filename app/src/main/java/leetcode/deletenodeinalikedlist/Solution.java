package leetcode.deletenodeinalikedlist;

import leetcode.ListNode;

public class Solution {
    public void deleteNode(ListNode node) {

    }

    public static void main(String[] args) {
        var s = new Solution();
        // As-is
        var a = new ListNode(4);
        var b = new ListNode(5);
        a.next = b;
        var c = new ListNode(1);
        b.next = c;
        var d = new ListNode(9);
        c.next = d;

        s.deleteNode(b);

        ListNode head = a;
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
