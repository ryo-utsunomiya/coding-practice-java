package leetcode.implementstackusingqueues;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();
    private int top;

    public MyStack() {
    }

    public void push(int x) {
        q1.offer(x);
        top = x;
    }

    public int pop() {
        while (q1.size() > 1) {
            top = q1.poll();
            q2.add(top);
        }
        q1.poll();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return top;
    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        // [1], []
        myStack.push(1);
        // [1,2] []
        myStack.push(2);
        // [1,2] []
        System.out.println(myStack.top()); // 2
        System.out.println(myStack.pop()); // 2
        System.out.println(myStack.empty()); // false
    }
}
