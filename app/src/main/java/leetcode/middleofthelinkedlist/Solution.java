package leetcode.middleofthelinkedlist;

import java.util.ArrayList;

// https://leetcode.com/problems/middle-of-the-linked-list/
public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        var nodes = new ArrayList<ListNode>();
        nodes.add(current);
        while (current.next != null) {
            current = current.next;
            nodes.add(current);
        }
        return nodes.get(nodes.size() / 2);
    }

    public static void main(String[] args) {
        var s = new Solution();
        var l = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
//        var l = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
//        var l = new ListNode(1);
        System.out.println(s.middleNode(l).val);
    }
}
