package crackingthecodinginterview.linkedlist.deletemiddlenode;

import crackingthecodinginterview.linkedlist.Node;

// 2.3 Delete Middle Node
// Implement an algorithm to delete a node in the middle
// (i.e., any node but the first and last node, not necessarily the exact middle)
// of a singly linked list, given only access to that node.
public class Solution {
    public void deleteMiddleNode(Node node) {
        if (node == null || node.next == null) {
            return;
        }

        Node next = node.next;
        node.data = next.data;
        node.next = next.next;
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var a = new Node(0);
            a.appendToTail(1);
            a.appendToTail(2);
            a.appendToTail(3);
            a.appendToTail(4);
            a.appendToTail(5);
            s.deleteMiddleNode(a.next.next);
            System.out.println(a); // 0->1->3->4->5
        }
    }
}
