package leetcode.reverselinkedlist;

import leetcode.ListNode;

public class Solution {
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

    public static void main(String[] args) {
        var s = new Solution();
        // 5,4,3,2,1
        var list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        // 2,1
//        var list = new ListNode(1, new ListNode(2));
        // 1
//        var list = new ListNode(1);
        var current = s.reverseList(list);
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}
