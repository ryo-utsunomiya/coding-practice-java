package leetcode.middleofthelinkedlist;

// https://leetcode.com/problems/middle-of-the-linked-list/
public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        var s = new Solution();
//        var l = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        var l = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
//        var l = new ListNode(1);
        System.out.println(s.middleNode(l).val);
    }
}
