package leetcode.swapnodeinpairs;

import leetcode.ListNode;

import java.util.List;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return head;
        }

        return swap(head);
    }

    ListNode swap(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = next.next;
        next.next = head;
        head = next;

        if (head.next.next != null) {
            head.next.next = swap(head.next.next);
        }

        return head;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.swapPairs(ListNode.of(List.of(1,2,3,4))));
        System.out.println(s.swapPairs(ListNode.of(List.of())));
        System.out.println(s.swapPairs(ListNode.of(List.of(1))));
    }
}
