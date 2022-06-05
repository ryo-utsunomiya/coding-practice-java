package leetcode.rotatelist;

import leetcode.ListNode;

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (k == 0) {
            return head;
        }

        // make the list cyclic
        var current = head;
        int numNodes = 0;
        while (current.next != null) {
            current = current.next;
            numNodes++;
        }
        // now, current is the tail, so make the list cyclic
        current.next = head;
        numNodes++;
        current = current.next;

        // then, move to the new head
        int moveCountToTheNewHead = numNodes - (k % numNodes);
        while (moveCountToTheNewHead > 0) {
            current = current.next;
            moveCountToTheNewHead--;
        }

        // current is the new head
        var newHead = current;

        // move to the new tail
        int moveCountToTheNewTail = numNodes - 1;
        while (moveCountToTheNewTail > 0) {
            current = current.next;
            moveCountToTheNewTail--;
        }

        // now, current is the tail
        current.next = null;

        return newHead;
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
            var result = s.rotateRight(a, 2);
            System.out.println(result.val); // 4
        }
        {
            var a = new ListNode(0);
            var b = new ListNode(1);
            var c = new ListNode(2);
            a.next = b;
            b.next = c;
            var result = s.rotateRight(a, 4);
            System.out.println(result.val);
        }
        {
            var result = s.rotateRight(null, 0);
            System.out.println(result);
        }
    }
}
