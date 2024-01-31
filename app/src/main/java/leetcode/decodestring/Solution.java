package leetcode.decodestring;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String decodeString(String s) {
        var stack = new ArrayDeque<Character>();

        for (char c : s.toCharArray()) {
            if (c == ']') {
                // decode string and push to stack
                List<Character> decodedString = new ArrayList<>();
                while (!stack.isEmpty() && stack.peek() != '[') {
                    decodedString.add(stack.pop());
                }

                stack.pop(); // remove '['

                int k = 0;
                int base = 1;
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    int d = stack.pop() - '0';
                    k = d * base + k;
                    base *= 10;
                }

                for (; k > 0; k--) {
                    for (int j = decodedString.size() - 1; j >= 0; j--) {
                        stack.push(decodedString.get(j));
                    }
                }

            } else {
                stack.push(c);
            }
        }

        var sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.decodeString("3[a]2[bc]")); // aaabcbc
        System.out.println(s.decodeString("3[a2[c]]")); // accaccacc
        System.out.println(s.decodeString("2[abc]3[cd]ef")); // abcabccdcdcdef
//        System.out.println(s.decodeString("100[leetcode]")); // leetcode x 100
    }
}
