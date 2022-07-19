package crackingthecodinginterview.linkedlist.returnkthtolast;

import crackingthecodinginterview.linkedlist.Node;

// 2.2 Return Kth to Last
// Implement an algorithm to find the Kth to last element of a singly linked list.
public class Solution {
    public Node findKthToLast(Node head, int k) {
        if (k < 0) {
            throw new IllegalArgumentException(" k must be larger than zero");
        }

        Node fast = head;
        Node slow = head;

        while (fast != null) {
            fast = fast.next;
            if (k < 0) {
                slow = slow.next;
            }
            k--;
        }

        return slow;
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var list = new Node(0);
            list.appendToTail(1);
            list.appendToTail(2);
            System.out.println(s.findKthToLast(list, 0).data); // 2
            System.out.println(s.findKthToLast(list, 1).data); // 1
            System.out.println(s.findKthToLast(list, 2).data); // 0
        }
    }
}
