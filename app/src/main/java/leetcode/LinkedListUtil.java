package leetcode;

import java.util.List;

public final class LinkedListUtil {
    private LinkedListUtil() {
    }

    public static ListNode from(List<Integer> numbers) {
        var dummyHead = new ListNode(-1);
        var current = dummyHead;
        for (var n : numbers) {
            current.next = new ListNode(n);
            current = current.next;
        }
        return dummyHead.next;
    }

    public static void print(ListNode list) {
        var current = list;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}
