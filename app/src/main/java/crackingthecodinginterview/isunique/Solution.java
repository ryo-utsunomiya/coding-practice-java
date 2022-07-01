package crackingthecodinginterview.isunique;

import java.util.HashSet;

// 1.1 Is Unique: Implement an algorithm to determine if a string has all unique characters.
// What if you cannot use additional data structures?
public class Solution {
    public boolean isUniqueChars(String s) {
        var charSet = new HashSet<Character>();
        for (char c : s.toCharArray()) {
            if (charSet.contains(c)) {
                return false;
            }
            charSet.add(c);
        }

        return true;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.isUniqueChars("a")); // true
        System.out.println(s.isUniqueChars("aa")); // false
        System.out.println(s.isUniqueChars("ab")); // true
    }
}
