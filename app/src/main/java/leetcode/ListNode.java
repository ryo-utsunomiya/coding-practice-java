package leetcode;

import java.util.Collection;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode of(Collection<Integer> numbers) {
        var dummyHead = new ListNode(-1);
        var current = dummyHead;
        for (var n : numbers) {
            current.next = new ListNode(n);
            current = current.next;
        }
        return dummyHead.next;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder("[");
        var current = this;
        while (true) {
            sb.append(current.val);
            current = current.next;
            if (current == null) {
                break;
            } else {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
