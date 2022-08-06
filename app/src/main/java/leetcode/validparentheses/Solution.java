package leetcode.validparentheses;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> paris = Map.of(
                ')', '(',
                '}', '{',
                ']', '['
        );
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (paris.containsKey(c)) {
                if (stack.peek() == paris.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.isValid("()")); // true
        System.out.println(s.isValid("()[]{}")); // true
        System.out.println(s.isValid("(]")); // false
        System.out.println(s.isValid("(")); // false
        System.out.println(s.isValid(")")); // false
    }
}
