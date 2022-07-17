package crackingthecodinginterview.arraysandstrings.isunique;

import java.util.HashSet;

// 1.1 Is Unique
// Implement an algorithm to determine if a string has all unique characters.
// What if you cannot use additional data structures?
public class Solution {
    public boolean isUniqueChars(String str) {
        var charSet = new HashSet<Character>();
        for (char c : str.toCharArray()) {
            if (charSet.contains(c)) {
                return false;
            }
            charSet.add(c);
        }

        return true;
    }

    public boolean isUniqueLowercaseAlphabets(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a'; // 0-25
            // << : left shift
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker = checker | (1 << val);
        }

        return true;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.isUniqueLowercaseAlphabets("a")); // true
        System.out.println(s.isUniqueLowercaseAlphabets("aa")); // false
        System.out.println(s.isUniqueLowercaseAlphabets("az")); // true
    }
}
