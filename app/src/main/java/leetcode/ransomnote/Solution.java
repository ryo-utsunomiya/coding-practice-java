package leetcode.ransomnote;

import java.util.HashMap;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        var charCountOfMagazine = new HashMap<Character, Integer>();
        for (char c : magazine.toCharArray()) {
            int count = charCountOfMagazine.getOrDefault(c, 0);
            charCountOfMagazine.put(c, count + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            int charCount = charCountOfMagazine.getOrDefault(c, 0);
            if (charCount == 0) {
                return false;
            }
            charCountOfMagazine.put(c, charCount - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.canConstruct("a", "b")); // false
        System.out.println(s.canConstruct("aa", "ab")); // false
        System.out.println(s.canConstruct("aa", "aab")); // true
        System.out.println(s.canConstruct("abc", "cab")); // true
    }
}
