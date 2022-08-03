package crackingthecodinginterview.linkedlist.sumlists;

import crackingthecodinginterview.linkedlist.Node;

// 2.5 Sum Lists
// You have two numbers represented by a linked list, where each node contains a single
// digit. The digits are stored in reverse order, such that the 1's digit is at the head of
// the list. Write a function that adds the two numbers and returns the sum as a linked
// list.
public class Solution {
    Node sumLists(Node a, Node b) {
        return addLists(a, b, 0);
    }

    Node addLists(Node a, Node b, int carry) {
        if (a == null && b == null && carry == 0) {
            return null;
        }

        Node result = new Node();
        int value = carry;
        if (a != null) {
            value += a.data;
        }
        if (b != null) {
            value += b.data;
        }
        result.data = value % 10; // second digit of number

        if (a != null || b != null) {
            result.next = addLists(
                    a == null ? null : a.next,
                    b == null ? null : b.next,
                    value >= 10 ? 1 : 0
            );
        }

        return result;
    }


    public static void main(String[] args) {
        var s = new Solution();
        {
            var a = new Node(7);
            a.appendToTail(1);
            a.appendToTail(6);
            var b = new Node(5);
            b.appendToTail(9);
            b.appendToTail(2);
            System.out.println(s.sumLists(a, b));
        }
    }
}
