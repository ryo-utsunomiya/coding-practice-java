package leetcode.removeduplicatesfromsortedlist;

import leetcode.ListNode;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        var s = new Solution();
//        var list = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        var list = new ListNode(1, new ListNode(1, new ListNode(1)));
        ListNode result = s.deleteDuplicates(list);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
