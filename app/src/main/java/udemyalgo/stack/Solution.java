package udemyalgo.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class Solution {
    public boolean isValidJson(String s) {
        Map<Character, Character> lookup = Map.of('{','}', '[',']', '(', ')');
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (lookup.containsKey(c)) {
                stack.push(lookup.get(c));
            } else if (lookup.containsValue(c)) {
                if (stack.isEmpty()) {
                    return false;
                } else if (c != stack.pop()) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.isValidJson("{\"key\":\"value\"}")); // true
        System.out.println(s.isValidJson("{\"key\":\"value\"")); // false
        System.out.println(s.isValidJson("{\"key\":[\"value\"]}")); // true
        System.out.println(s.isValidJson("{\"key\":[\"value\"}]")); // false
    }
}
