package crackingthecodinginterview.checkpermuration;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// 1.2 Check Permutation
// Given two strings, write a method to decide if one is a permutation of the other.
public class Solution {
    public boolean isPermutation(String a, String b) {
        if (a.equals(b)) {
            return true;
        } else if (a.length() != b.length()) {
            return false;
        }

        Map<Character, Integer> charCountA = countChars(a);
        Map<Character, Integer> charCountB = countChars(b);

        for (Map.Entry<Character, Integer> e : charCountA.entrySet()) {
            if (!charCountB.containsKey(e.getKey())) {
                return false;
            } else if (!Objects.equals(charCountB.get(e.getKey()), e.getValue())) {
                return false;
            }
        }

        return true;
    }

    private Map<Character, Integer> countChars(String a) {
        var charCounter = new HashMap<Character, Integer>();
        for (char c : a.toCharArray()) {
            if (!charCounter.containsKey(c)) {
                charCounter.put(c, 0);
            }
            charCounter.put(c, charCounter.get(c) + 1);
        }
        return charCounter;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.isPermutation("a", "a")); // true
        System.out.println(s.isPermutation("aa", "ab")); // false
        System.out.println(s.isPermutation("ab", "ba")); // true
        System.out.println(s.isPermutation("abc", "bca")); // true
        System.out.println(s.isPermutation("abc", "bcaa")); // true
    }
}
