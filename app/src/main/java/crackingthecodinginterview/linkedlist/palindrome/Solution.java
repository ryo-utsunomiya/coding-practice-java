package crackingthecodinginterview.linkedlist.palindrome;

import crackingthecodinginterview.linkedlist.Node;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public boolean isPalindrome(Node head) {
        if (head == null) {
            return false;
        } else if (head.next == null) {
            return true;
        }

        Deque<Node> stack = new ArrayDeque<>();

        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            stack.push(fast);
            fast = fast.next.next;
            slow = slow.next;
        }

        // odd number
        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            Node top = stack.pop();
            if (top.data != slow.data) {
                return false;
            }
            slow = slow.next;
        }

        return true;
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var a = new Node(1);
            a.appendToTail(2);
            a.appendToTail(1);
            System.out.println(s.isPalindrome(a)); // true
        }
        {
            var a = new Node(1);
            a.appendToTail(2);
            a.appendToTail(2);
            a.appendToTail(1);
            System.out.println(s.isPalindrome(a)); // true
        }
        {
            var a = new Node(1);
            a.appendToTail(2);
            System.out.println(s.isPalindrome(a)); // false
        }
    }
}
