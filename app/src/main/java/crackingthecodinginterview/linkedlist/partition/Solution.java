package crackingthecodinginterview.linkedlist.partition;

import crackingthecodinginterview.linkedlist.Node;

// 2.4 Partition
// Write code to partition a linked list around a value x, such that all nodes less than x
// come before all nodes greater than or equal to x.
// If x is contained within the list, the values of x only need to be after the elements
// less than x.
// The partition element x can appear anywhere in the "right partition"; it does not need
// to appear between the left and right partitions.
public class Solution {
    public Node partition(Node node, int x) {
        if (node == null) {
            return null;
        }

        Node head = node;
        Node tail = node;

        while (node != null) {
            Node next = node.next;
            if (node.data < x) {
                node.next = head;
                head = node;
            } else {
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;

        return head;
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var list = new Node(3);
            list.appendToTail(5);
            list.appendToTail(8);
            list.appendToTail(5);
            list.appendToTail(10);
            list.appendToTail(2);
            list.appendToTail(1);
            System.out.println(s.partition(list, 5)); // [3,1,2,10,5,5,8]
        }
        {
            var list = new Node(3);
            list.appendToTail(8);
            list.appendToTail(10);
            list.appendToTail(2);
            list.appendToTail(1);
            s.partition(list, 5);
            System.out.println(list); // [3,2,1,8,10]
        }
    }
}
