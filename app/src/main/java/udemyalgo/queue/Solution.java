package udemyalgo.queue;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Solution {
    public void reverseQueue(Queue<Integer> queue) {
        var stack = new ArrayDeque<Integer>();
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        var s = new Solution();
        var q = new ArrayDeque<>(List.of(1, 2, 3));
        s.reverseQueue(q);
        System.out.println(q);
    }
}
