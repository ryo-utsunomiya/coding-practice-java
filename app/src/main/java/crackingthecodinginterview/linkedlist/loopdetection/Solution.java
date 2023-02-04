package crackingthecodinginterview.linkedlist.loopdetection;

import crackingthecodinginterview.linkedlist.Node;

public class Solution {
    public Node findTheBeginningOfTheLoop(Node head) {
        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var a = new Node(1);
            var b = new Node(2);
            var c = new Node(3);
            var d = new Node(4);
            var e = new Node(5);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = c;
            var result = s.findTheBeginningOfTheLoop(a);
            // System.out.println(result);
            if (result != null) {
                System.out.println(result.data);
            }
        }
    }
}
