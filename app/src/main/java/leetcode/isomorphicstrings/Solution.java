package leetcode.isomorphicstrings;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        var charMap = new HashMap<Character, Character>();
        var mappedChars = new HashSet<Character>();
        for (var i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (!charMap.containsKey(sc) && !mappedChars.contains(tc)) {
                charMap.put(sc, tc);
                mappedChars.add(tc);
            }
        }
        var converted = new StringBuilder();
        for (var c : s.toCharArray()) {
            if (charMap.containsKey(c)) {
                converted.append(charMap.get(c));
            }
        }
        return t.equals(converted.toString());
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.isIsomorphic("egg", "add")); // true
        System.out.println(s.isIsomorphic("foo", "bar")); // false
        System.out.println(s.isIsomorphic("paper", "title")); // true
        System.out.println(s.isIsomorphic("badc", "baba")); // false
        System.out.println(s.isIsomorphic("bbbaaaba", "aaabbbba")); // false
    }
}
