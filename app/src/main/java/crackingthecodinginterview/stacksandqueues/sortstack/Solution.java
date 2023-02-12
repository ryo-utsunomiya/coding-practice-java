package crackingthecodinginterview.stacksandqueues.sortstack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public static void sort(Deque<Integer> s) {
        Deque<Integer> r = new ArrayDeque<>();
        while (!s.isEmpty()) {
            int tmp = s.pop();
            while (!r.isEmpty() && r.peek() > tmp) {
                s.push(r.pop());
            }
            r.push(tmp);
        }

        while (!r.isEmpty()) {
            s.push(r.pop());
        }
    }

    public static void main(String[] args) {
        var s = new ArrayDeque<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek()); // 3
        sort(s);
        System.out.println(s.pop()); // 1
        System.out.println(s.pop()); // 2
        System.out.println(s.pop()); // 3
    }
}
