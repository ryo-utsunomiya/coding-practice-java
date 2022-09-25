package leetcode.evaluatereversepolishnotation;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                stack.push(doOperate(token, stack.pop(), stack.pop()));
            } else {
                stack.push(Integer.valueOf(token));
            }
        }

        return stack.pop();
    }

    boolean isOperator(String token) {
        switch (token) {
            case "+":
            case "-":
            case "*":
            case "/":
                return true;
            default:
                return false;
        }
    }

    int doOperate(String token, int a, int b) {
        switch (token) {
            case "+":
                return b + a;
            case "-":
                return b - a;
            case "*":
                return b * a;
            case "/":
            default:
                return b / a;
        }
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.evalRPN(new String[]{"2","1","+","3","*"})); // 9
        System.out.println(s.evalRPN(new String[]{"4","13","5","/","+"})); // 6
        System.out.println(s.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"})); // 22
    }
}
