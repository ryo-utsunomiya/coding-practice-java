package crackingthecodinginterview.linkedlist.removedups;

import crackingthecodinginterview.linkedlist.Node;

import java.util.HashSet;

// 2.1 Remove Dups
// Write code to remove duplicates from an unsorted linked list.
public class Solution {
    public Node removeDuplicates(Node head) {
        var numbersSet = new HashSet<Integer>();
        Node current = head;
        Node prev = null;
        while (current != null) {
            if (numbersSet.contains(current.data)) {
                prev.next = current.next;
            } else {
                numbersSet.add(current.data);
                prev = current;
            }
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var node = new Node(0);
            node.appendToTail(1);
            node.appendToTail(0);
            System.out.println(s.removeDuplicates(node));
        }
    }
}
