package leetcode.implementqueueusingstacks;

import java.util.Stack;

public class MyQueue {
    private final Stack<Integer> insert = new Stack<>();
    private final Stack<Integer> delete = new Stack<>();

    public MyQueue() {}

    public void push(int x) {
        insert.push(x);
    }

    public int pop() {
        shift();
        return delete.pop();
    }

    public int peek() {
        shift();
        return delete.peek();
    }

    public boolean empty() {
        shift();
        return delete.isEmpty();
    }

    void shift() {
        if (delete.isEmpty()) {
            while (!insert.isEmpty()) {
                delete.push(insert.pop());
            }
        }
    }

    public static void main(String[] args) {
        var q = new MyQueue();
        q.push(1);
        q.push(2);
        System.out.println(q.pop()); // 1
        System.out.println(q.peek()); // 2
        System.out.println(q.empty()); // false
    }
}
