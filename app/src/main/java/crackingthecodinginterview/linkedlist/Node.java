package crackingthecodinginterview.linkedlist;

public class Node {
    public Node next = null;
    public final int data;

    public Node(int d) {
        data = d;
    }

    public void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public Node deleteNode(Node head, int d) {
        Node n = head;

        if (n.data == d) {
            return head.next;
        }

        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }

        return head;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder("[");

        Node n = this;
        while (true) {
            sb.append(n.data);
            n = n.next;
            if (n == null) {
                break;
            } else {
                sb.append(",");
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
